package Exercise2_RecipeSearch;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


class UserInterface{
    Scanner scanner;
    private CookBook book;

    public UserInterface(Scanner scanner, CookBook book){
        this.scanner = scanner;
        this.book = book;
    }

    public void start()throws FileNotFoundException {
        //get file to read
        System.out.println("File to read: " );
        String fileName = scanner.nextLine();
        //load recipes into CookBook
        book.loadRecipesFromFile(fileName);

        //print out entire file contents
        displayCommands();
        //Execute based on command entered
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("stop")){
                break;
            }
            //list recipes here
            if(command.equalsIgnoreCase("list")){
                displayBriefRecipes();
            } else if(command.equalsIgnoreCase("find name")){ //search recipe based on ingredient
                System.out.print("Search by word: ");
                String ingredient = scanner.nextLine();
                //prints out specific recipe
                book.getSpecificRecipe(ingredient);
            } else if(command.equalsIgnoreCase("find cooking time")){ //search for recipes based on max cooking time
                System.out.print("Enter max cooking time: ");
                int cookingTime = Integer.parseInt(scanner.nextLine());
                book.getSpecificRecipe(cookingTime);
            } else if(command.equalsIgnoreCase("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                book.getSpecificRecipe(ingredient);
            }
        }
    }

    public void displayBriefRecipes(){
        book.displayList();
    }
    public void displayCommands(){
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("stop - stop the program");

    }
}

package Exercise2_RecipeSearch;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class UserInterface{
    Scanner scanner;
    private CookBook book;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }

    public void start() throws FileNotFoundException{
        //get file to read
        System.out.println("File to read: " );
        String fileName = scanner.nextLine();
        //Move this bottom part to Recipe class
        //create file object and new scanner object with file provided
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        //print out entire file contents
        System.out.println("Commands:");
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

            }
        }
    }

    public void displayCommands(){
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("stop - to exit program");
    }
}

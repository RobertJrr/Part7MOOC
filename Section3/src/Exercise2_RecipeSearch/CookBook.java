package Exercise2_RecipeSearch;
//will hold list of objects of type Recipe
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CookBook {

    //list to hold Recipe objects
    private ArrayList<Recipe> recipes;

    //constructor
    public CookBook(){
        this.recipes = new ArrayList<>();
    }

    //adds Recipe object to list
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    //display brief description of recipe
    public void displayList(){
        for(Recipe recipe : recipes){
            System.out.println(recipe);
        }
    }

    //create new Recipe objects with file scanner and add them to CookBook
    //List of Recipe type
    public void loadRecipesFromFile(String filename) throws FileNotFoundException{
        //create file object of specified file and scanner to read from file
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        String recipeText = "";
        String line = "";

        //read lines
        while(fileScanner.hasNextLine()){
            line = fileScanner.nextLine();
            //if line is empty restart everything for next recipe and continue reading
            if(line.isEmpty()){
               processRecipeText(recipeText);
               recipeText = "";
                continue;
            }
            //add lines as one string
            recipeText = recipeText.concat(line).concat("\n");
        }

        //call one more time to process last recipe. Above loop ends if no next Line is detected so ends before processing last one
        if(!recipeText.isEmpty()){
            processRecipeText(recipeText);
        }
    }

    //takes care of processing the recipe, called in loadRecipesFromFile method
    public void processRecipeText(String recipeText){
        //split into array of String based on new line
        String[] info = recipeText.split("\n");

        //Store name and cooking time
        String recipeName = info[0];
        int cookingTime = Integer.parseInt(info[1]);
        //Adding recipe to CookBook ArrayList<Recipe> list
        Recipe recipe = new Recipe(recipeName,cookingTime);
        this.addRecipe(recipe);
        //add remaining ingredients to Recipe list
        for(int i = 2; i < info.length; i++){
            recipe.addIngredients(info[i]);
        }
        //reset all of info arrays
        for(String rs : info){
            rs = "";
        }
    }

    public void getSpecificRecipe(String ingredient){
        //if a recipe contains that specific ingredient or name print out the recipe
       for(Recipe recipe : recipes){
           if(recipe.getIngredientsList().contains(ingredient) || recipe.toString().contains(ingredient)){
               System.out.println(recipe);
           }
       }
    }

    public void getSpecificRecipe(int cookingTime){
        System.out.println("Recipes: ");
        for(Recipe recipe : recipes){
            if(recipe.getCookingTime() <= cookingTime){
                System.out.println(recipe);
            }
        }
    }

}

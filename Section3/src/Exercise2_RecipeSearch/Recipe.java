package Exercise2_RecipeSearch;

import java.util.ArrayList;

//Will hold the name, cooking time and ingredients for each recipe
//Will Also take care of the searching functionality
class Recipe {

    //holds recipe name
    private String name;
    //holds recipe cooking time
    private int cookingTime;
    //holds rest of ingredients
    private ArrayList<String> ingredients;

    //constructor
    public Recipe(String name, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    //add ingredients to list
    public void addIngredients(String ingredient){
        ingredients.add(ingredient);
    }

    //get ingredients list for this recipe
    public ArrayList<String> getIngredientsList(){
        return this.ingredients;
    }

    //get cooking time for this recipe
    public int getCookingTime(){
        return this.cookingTime;
    }

    @Override
    public String toString(){
        return this.name + ",cooking time: " + this.cookingTime;
    }
}

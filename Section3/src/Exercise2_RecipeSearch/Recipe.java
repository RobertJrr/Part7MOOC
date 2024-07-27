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

    public void addIngredients(String ingredient){
        ingredients.add(ingredient);
    }


    @Override
    public String toString(){
        return this.name +",cooking time: " + this.cookingTime;
    }
}

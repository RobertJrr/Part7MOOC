package Exercise2_RecipeSearch;
//will hold list of objects of type Recipe
import java.util.ArrayList;

class CookBook {

    private ArrayList<Recipe> recipes;

    public CookBook(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }


}

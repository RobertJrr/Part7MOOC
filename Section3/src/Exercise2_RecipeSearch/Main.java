package Exercise2_RecipeSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        CookBook book = new CookBook();
        UserInterface ui = new UserInterface(scanner,book);
        ui.start();

    }
}

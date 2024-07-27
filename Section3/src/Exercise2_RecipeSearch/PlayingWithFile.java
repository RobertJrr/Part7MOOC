package Exercise2_RecipeSearch;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class PlayingWithFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("recipes.txt");
        Scanner scanner = new Scanner(file);
        int num = 0;

        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            if(input.matches("[0-9]+")){
                num = Integer.parseInt(input);
            }

            System.out.println(input);

        }

        System.out.println("printing num: " + num);

    }
}

package ReadingWritingFilesPractice;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class Main {
    public static void main(String[] args) throws IOException {
        //can use this to get abs file path of a file
//        System.out.print("Absolute file path: ");
//        System.out.println(new File("recipes.txt").getAbsolutePath());
        //----------------------------------------------------------------------------------------------------------------------

        //must specify full abs path(including src and package directorty
        File file = new File("Section3/src/ReadingWritingFilesPractice/recipes.txt");
        Scanner scanner = new Scanner(file); //scanning file we made

        String fileContent = "Sample Text file we made\n";
        //reading all lines in file
        while(scanner.hasNextLine()){
            //read everything and add it to this string from recipes.txt
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        //specifying path starting from Section3
        FileWriter writer = new FileWriter("Section3/src/ReadingWritingFilesPractice/sample.txt");
        writer.write(fileContent); //writes to file sample.txt
        writer.close(); //closes to ensure nothing screws up
    }
}

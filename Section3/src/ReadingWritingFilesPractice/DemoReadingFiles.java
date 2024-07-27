package ReadingWritingFilesPractice;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class DemoReadingFiles {
    //method header
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(System.in); //reads form keyboard
//        int num = 0;
//        System.out.print("Input a number: ");
//        num = s.nextInt();
//        System.out.println("You entered: " + num);

        File file = new File("in1.txt");
        Scanner scanner = new Scanner(file);
        //next() reads up to whitepsace, nextLine() reads up to line break
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}

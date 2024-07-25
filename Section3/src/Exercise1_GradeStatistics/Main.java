package Exercise1_GradeStatistics;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner,course);
        ui.start();

    }
}

package Exercise1_GradeStatistics;
/*This class will be for the UserInterface. Will get the input
* and take care of the interactions*/
import java.util.Scanner;

class UserInterface {
    private Scanner scanner;
    private Course course;

    public UserInterface(Scanner scanner, Course course){
        this.scanner = scanner;
        this.course = course;
    }


    //start method. Prompts user for input
    public void start(){
        System.out.println("Enter point totals, -1 stops: ");
        while(true){

            try{
                String point = scanner.nextLine();

                if(Integer.parseInt(point) == -1){
                    break;
                }
                course.addScore(point);
            }catch(NumberFormatException nfe){
                System.out.println("Invalid input, try again");

            }

        }
        System.out.println("Point average (all): " + course.calculateAverage(course.getScores()));
        System.out.println("Point average (passing): " + course.calcPassingAverage());
        course.passPercentage();
        course.gradeDistribution();
    }
}

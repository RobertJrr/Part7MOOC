package Exercise1_GradeStatistics;
/*This class will be for the UserInterface. Will get the input
* and take care of the interactions and display info*/
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
        System.out.println("Pass Percentage: %" + course.passPercentage());
        this.gradeDistribution();
    }


    //print out the grade distribution
    public void gradeDistribution(){
        course.convertScoreToGrade();
        int aGrade = 5;
        while(aGrade >= 0){
            System.out.print(aGrade + ":");
            int stars = numberOfaPassingGrade(aGrade);
            printStars(stars);
            System.out.println();
            aGrade--;

        }
    }

    //print out the number of stars based on amount of specific grade
    public void printStars(int count){
        while(count > 0){
            System.out.print("*");
            count--;
        }
    }

    //get the amount of a specific grade
    public int numberOfaPassingGrade(int grade){
        int count = 0;
        for(Integer score : course.getGradeScore()){
            if(score == grade){
                count++;
            }
        }
        return count;

    }
}

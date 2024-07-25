package Exercise1_GradeStatistics;
/*Class will hold a list of scores and do the calculations*/
import java.util.ArrayList;

class Course {
    //ArrayList to hold scores of Integer type
    private ArrayList<Integer> scores;
    private ArrayList<Integer> passingScores;

    //constructor to initialize ArrayList
    public Course(){
        this.scores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
    }

    //return the list of scores
    public ArrayList<Integer> getScores(){
        return this.scores;
    }

    public ArrayList<Integer> getPassingScores(){
        return this.passingScores;
    }

    //add the score if it is between 0 and 100 inclusive
    public void addScore(String score){
        if(Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100){
            this.scores.add(Integer.valueOf(score));
        }

        if(Integer.parseInt(score) > 50 && Integer.parseInt(score) <= 100){
            this.passingScores.add(Integer.parseInt(score));
        }
    }

    //calculate total points of a list passed to it
    public int totalPoints(ArrayList<Integer> list){
        int totalPoints = 0;

        for(Integer score : list){
            totalPoints += score;
        }
        return totalPoints;
    }

    //Calculate average of scores in a list
    public double calculateAverage(ArrayList<Integer> list){
        //calculating the average
        return (double)totalPoints(list) / list.size();
    }

    //calcuate the average of passing scores only
    public double calcPassingAverage(){
        if(passingScores.isEmpty()){
            return 0;
        }
        //call method and return average of passingScores
        return calculateAverage(this.passingScores);
    }

    public void passPercentage(){
        double passingPercent = (double)100 * passingScores.size() / scores.size();
        System.out.println("Passing percentage: %" + passingPercent);
    }

    public void gradeDistribution(){
        int startingGrade = 5;
        System.out.println("Grade Distribution: ");
        while(startingGrade >= 0){
            System.out.print(startingGrade + ":");
            for(Integer score : scores){
                if(score >= 90 && startingGrade == 5){
                    System.out.print("*");
                }else if(score >= 80 && score < 90 && startingGrade == 4){
                    System.out.print("*");
                }else if(score >= 70 && score < 80 && startingGrade == 3){
                    System.out.print("*");
                }else if(score >= 60 && score < 70 && startingGrade == 2){
                    System.out.print("*");
                }else if(score >= 50 && score < 60 && startingGrade == 1){
                    System.out.print("*");
                }else if(score < 50 && startingGrade == 0){
                    System.out.print("*");
                }
            }
            System.out.println();

            startingGrade--;
        }


    }

}

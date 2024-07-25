package Exercise1_GradeStatistics;
/*Class will hold a list of scores and do the calculations and logic*/
import java.util.ArrayList;

class Course {
    //ArrayList to hold scores of Integer type
    private ArrayList<Integer> scores;
    private ArrayList<Integer> passingScores;
    private ArrayList<Integer> gradeScore;

    //constructor to initialize ArrayList
    public Course(){
        this.scores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
        this.gradeScore = new ArrayList<>();
    }

    //return the list of scores
    public ArrayList<Integer> getScores(){
        return this.scores;
    }

    public ArrayList<Integer> getPassingScores(){
        return this.passingScores;
    }

    public ArrayList<Integer> getGradeScore() {
        return gradeScore;
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

    //calculating percentage of passing
    public double passPercentage(){
        return (double)100 * passingScores.size() / scores.size();
    }

    //converting score to a grade and storing it in list
    public void convertScoreToGrade(){
        for(Integer score : scores){
            if(score >= 90){
                gradeScore.add(5);
            }else if(score >= 80 && score < 90){
                gradeScore.add(4);
            }else if(score >= 70 && score < 80){
                gradeScore.add(3);
            }else if(score >= 60 && score < 70){
                gradeScore.add(2);
            }else if(score >= 50 && score < 60){
                gradeScore.add(1);
            }else if(score < 50){
                gradeScore.add(0);
            }
        }
    }

//    public void gradeDistribution(){
//        int startingGrade = 5;
//        System.out.println("Grade Distribution: ");
//        while(startingGrade >= 0){
//            System.out.print(startingGrade + ":");
//            for(Integer score : scores){
//                if(score >= 90 && startingGrade == 5){
//                    System.out.print("*");
//                }else if(score >= 80 && score < 90 && startingGrade == 4){
//                    System.out.print("*");
//                }else if(score >= 70 && score < 80 && startingGrade == 3){
//                    System.out.print("*");
//                }else if(score >= 60 && score < 70 && startingGrade == 2){
//                    System.out.print("*");
//                }else if(score >= 50 && score < 60 && startingGrade == 1){
//                    System.out.print("*");
//                }else if(score < 50 && startingGrade == 0){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//            startingGrade--;
//        }
//
//    }

}

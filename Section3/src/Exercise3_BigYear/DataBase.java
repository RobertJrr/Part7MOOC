package Exercise3_BigYear;

//holds list of Birds
import java.util.ArrayList;

class DataBase {

    private ArrayList<Bird> birds;

    public DataBase(){
        birds = new ArrayList<>();
    }

    public void printAllBirds(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    public void addBirdToDataBase(Bird bird){
        birds.add(bird);
        System.out.println("Bird Added");
    }

    //if
    public void addObservation(String observation){
        boolean aBird = false;
        for(Bird bird : birds){
            if(observation.equalsIgnoreCase(bird.getName())){
                bird.increaseObservation();
                aBird = true;
            }
        }
        if(!(aBird)){
            System.out.println("Not a bird!");

        }
    }

    public void printOne(String name){
        //loop through array and print out one bird only then break
        for(Bird bird : birds){
            if(name.equalsIgnoreCase(bird.getName())){
                System.out.println(bird);
                break;
            } else {
                System.out.println("No bird of that name found");
            }
        }
    }
}

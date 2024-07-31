package Exercise3_BigYear;

//will possess name and description
class Bird {

    private final String name;
    private final String latinName;
    private int observation;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName(){
        return this.name;
    }

    public void increaseObservation(){
        this.observation++;
    }


    @Override
    public String toString(){
        return this.name + "(" + this.latinName + "): " + this.observation + " observations";
    }

}

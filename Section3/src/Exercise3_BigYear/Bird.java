package Exercise3_BigYear;

//will possess name and description
class Bird {

    private String name;
    private String latinName;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }


    @Override
    public String toString(){
        return this.name + "(" + this.latinName + "): ";
    }

}

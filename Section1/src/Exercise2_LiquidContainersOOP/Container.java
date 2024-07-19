package Exercise2_LiquidContainersOOP;

class Container {
    private int containerLevel;
    private int max;
    private int minimum;

    public Container(){
        this.containerLevel = 0;
        this.max = 100;
        this.minimum = 0;
    }

    public int contains(){
        return this.containerLevel;
    }

    public void add(int amount){
       if(amount < 0){
           return;
       }

       containerLevel += amount;
       if(containerLevel > max){
           containerLevel = max;
       }
    }


    public void remove(int amount){
        if(amount < 0){
            return;
        }

        containerLevel -= amount;
        if(containerLevel < 0){
            containerLevel = 0;
        }
    }

    public String toString(){
        return "amount of liquid: " + containerLevel + "/100";
    }


}

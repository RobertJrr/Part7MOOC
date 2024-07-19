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

    public void setContainerLevel(int amount){
       this.containerLevel = amount;
    }

    public int getContainerLevel(){
        return this.containerLevel;
    }

    public void add(int amount){
        if(amount > minimum){
            this.containerLevel += amount;
            if(this.containerLevel > max){
                containerLevel = max;
            }
        }
    }


    public void remove(int amount){
        if(amount > minimum){
            this.containerLevel -= amount;
            if(this.containerLevel < minimum){
                this.containerLevel = minimum;
            }
        }
    }

    public void move(Container container2, int amount){
       if(amount > minimum){
           container2.add(amount);
           this.remove(amount);
           if(this.containerLevel < minimum){
               this.setContainerLevel(minimum);
           }
       }
    }

    public String toString(){
        return containerLevel + "/100";
    }


}

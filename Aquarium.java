public class Aquarium {
    private int numberFish;
    Aquarium(int numberFish){
        this.numberFish=numberFish;
    }
    public int getNumberFish(){
        return this.numberFish;
    }
    public boolean addFish(){
        this.numberFish+=1;
        return true;
    }
    
    public boolean removeFish(int number){
        if (getNumberFish()<number){
            
            return false;
        }
        else{
            this.numberFish-=number;
            return true;
        }

    }
    public boolean removeFish(){
        if (getNumberFish()==0){
            
            return false;
        }
        else{
            this.numberFish-=1;
            return true;
        }
    }
}
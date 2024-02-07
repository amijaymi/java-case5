public class Person {
    private String name;
    private String tcno;
    private Aquarium aquarium;
    private Cat cat;
    public Person(String name, String tcno){
        this.name=name;
        this.tcno=tcno;
    }
    public String getName(){
        return this.name;
    }
    public String getTcno(){
        return this.tcno;
    }
    public void setCat(Cat cat){
        this.cat=cat;
    }
    public void setAqu(Aquarium aquarium){
        this.aquarium=aquarium;
    }
    public void introduceYourself(){
        System.out.println("Hello ,my name is"+getName()+" and my tc number is"+getTcno());
        if(aquarium!=null){
            System.out.println("i have an aquarium with"+aquarium.getNumberFish()+"number of fish");
        }
        
        if(cat!=null){
            System.out.println("i have a cat named"+cat.getName());

        }
    }
    
}

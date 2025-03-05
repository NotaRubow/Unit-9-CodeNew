package animal_demo;

public class Dalmation extends Dog{
    private int numSpots;
    public Dalmation(String name, int age, String hairType, String breed, int numSpots) {
        super(name, age, hairType, breed);
        this.numSpots=numSpots;
    }
    public void work(){
        System.out.printf("%s is working", this.getName());
    }
}

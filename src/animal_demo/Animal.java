package animal_demo;

public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat (){
        System.out.println(name +"is eating");
    }

    public String getName() {
        return name;
    }
}

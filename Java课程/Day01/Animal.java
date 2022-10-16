package Day01;

public class Animal {
    public String name;
    public int age;
    public double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void show(){
        System.out.println("shout!");
    }
    public void eat() {
        System.out.println("Eat!");
    }
}

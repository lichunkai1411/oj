package Day01;

public class Dog extends Animal implements Comparable {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void shout() {
        System.out.println("Wang wang wang!");

    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2, 10);
        dog.shout();
    }

    @Override
    public int compare(Object object) {
        return 0;
    }
}

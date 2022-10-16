package Java面向对象编程.多态;

public class TestPolymorphism {
    public static void main(String[] args) {
//        animalCry(new Day01.Dog());
//        animalCry(new Day01.Dog.Day01.Cat());


        // 编译类型Animal    运行时类型Dog
        Animal animal = new Dog();   // 向上转型(自动)
        animal.shout();
        Dog dog = (Dog) animal;     // 向下转型(强转)
        dog.seeDoor();


    }
    static void animalCry(Animal animal) {     // Day01.Animal animal = new Day01.Dog();
//        System.out.println("TestPolymorphism.animalCry");
        animal.shout();    // 可以出现多态
    }
}

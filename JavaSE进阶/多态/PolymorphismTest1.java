package 多态;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：17:34
 * @author lck
 */

/**
 *          多态前提：
 *                  有继承 / 实现关系
 *                  有方法重写
 *                  有父类引用指向子类对象
 *          1.对象多态
 *                      Animal animal1 = new Dog();
 *                      Animal animal2 = new Cat();
 *
 *                      好处：方法的形参定义为父类类型，这个方法就可以接收到该父类对的任意子类对象了
 *
 *           2.行为多态
 *                      好处：同一个方法，具有多种不同表现形式，或形态的能力
 *
 * @author lck
 */
public class PolymorphismTest1 {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        // 要想左右两边类型不一致需要左边得是父类的引用右边是子类对象(对象多态)
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        userAnimal(new Dog());
        userAnimal(new Cat());
    }
    public static void userAnimal(Animal animal){
        animal.eat();
    }
}
abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

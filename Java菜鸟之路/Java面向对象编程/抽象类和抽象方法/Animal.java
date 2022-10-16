package Java面向对象编程.抽象类和抽象方法;

/**
 * 测试抽象类
 * 有抽象方法的类只能定义成抽象类
 * 抽象类不能实例化，即不能用new来实例化抽象类
 * 抽象类可以包含属性、方法、构造方法。但是构造方法不能来new实例，只能用来被子类调用
 * 抽象类只能用来被继承
 * 抽象方法必须被子类实现
 */
public abstract class Animal {
    public abstract void rest();    // 抽象方法1

    public abstract void run();     // 抽象方法2

    int age;

    public void shout() {
        System.out.println("Day01.Animal.shout");
    }

}

class Dog extends Animal {

    @Override
    public void rest() {
        System.out.println("Day01.Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Day01.Dog.run");
    }
}

class Cat extends Animal {
    @Override
    public void rest() {
        System.out.println("Day01.Cat.rest");
    }

    @Override
    public void run() {
        System.out.println("Day01.Cat.run");
    }
}

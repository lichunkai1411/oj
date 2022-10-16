package Java面向对象编程.方法的重写;

/**
 * 测试方法的重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
        horse.getVehicle();
        Planet planet = new Planet();
        planet.run();
    }
}
class Vehicle{
    public void run(){
        System.out.println("跑……");
    }
    public Vehicle getVehicle() {
        System.out.println("给你一个交通工具！");
        return null;
    }
}
class Horse extends Vehicle {
    @Override
    public void run() {
        System.out.println("jiajiajia!");
    }
}
class Planet extends Vehicle {
    @Override
    public void run() {
        System.out.println("sou……");
    }
}

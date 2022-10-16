package Java面向对象编程.多态;

public class Animal {
    public void shout(){
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪……");
    }
    public void seeDoor(){
        System.out.println("看门中……");
    }

    static class Cat extends Animal {
        @Override
        public void shout() {
            System.out.println("喵喵喵……");
        }
    }
}

package Java面向对象编程.接口;

/**
 * 飞行接口
 */
public interface Volant {
    int Fly_Hight = 100;
    void fly();
}
// 善良的接口
interface Honest{
    void helpOther();
}
class goodMan implements Honest {

    @Override
    public void helpOther() {
        System.out.println("帮助别人！");
    }
}

class birdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("我会飞！");
    }
}

class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void helpOther() {
        System.out.println("I help other");
    }
}

class Plane implements Volant{

    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }
}
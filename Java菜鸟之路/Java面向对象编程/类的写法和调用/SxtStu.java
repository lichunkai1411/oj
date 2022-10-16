package Java面向对象编程.类的写法和调用;

public class SxtStu {
    // 属性
    int id;
    String name;
    int age;
    // 计算机
    Computer comp;
    // 方法
    void study(){
        System.out.println("我在认真学习！！,使用的电脑："+comp.brand);
    }
    void  play(){
        System.out.println("我在玩游戏！王者荣耀！");
    }

    public static void main(String[] args) {
        // 创建一个对象
        SxtStu stu = new SxtStu();
        stu.play();
        stu.id = 1001;
        stu.name = "李春凯";
        Computer c1 = new Computer();
        c1.brand = "Mac";
        stu.comp = c1;
        stu.study();
    }
}
class Computer{
    String brand;
}

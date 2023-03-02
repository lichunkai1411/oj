package Java面向对象编程.方法.类和对象;

/**
 * 一个学生类
 */
public class SxtStu {
    int id;
    int age;
    String name;
    public void study() {
        System.out.println("正在学习！");
    }

    public void Football() {
        System.out.println("正在踢球！");
    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.id = 1001;
        s1.name = "lick";
        s1.age = 19;
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.study();
        s1.Football();
    }
}

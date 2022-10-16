package Java面向对象编程.继承;

public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student("lick", 180, "Java程序设计");
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会！");
    }
}

class Student extends Person {
    // String name;
    // int height;
    String major;

    public void rest() {
        System.out.println("休息一会！");
    }

    public void study() {
        System.out.println("学习！");
        rest();
        System.out.println(this.name);
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }
}
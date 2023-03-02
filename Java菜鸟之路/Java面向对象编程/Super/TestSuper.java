package Java面向对象编程.Super;

// 测试super
public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass {
    public int value;

    public void f() {
        value = 100;
        System.out.println("FatherClass.value = " + value);
    }
}

class ChildClass extends FatherClass {
    public int value;
    public int age;

    public void f() {
        // 使用super关键字调用父类的普通方法
        super.f();
        value = 200;
        System.out.println("ChildClass.value = " + value);
        System.out.println(value);
        // 使用super关键字调用父类的成员变量
        System.out.println(super.value);
    }

    public void f2() {
        System.out.println(age);
    }
}

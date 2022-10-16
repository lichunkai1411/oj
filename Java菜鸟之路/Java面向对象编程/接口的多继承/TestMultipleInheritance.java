package Java面向对象编程.接口的多继承;

/**
 * 测试接口的多继承
 */
public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new CImpl();
        c.testA();
        c.testB();
        c.testC();
    }
}

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A, B {
    void testC();
}

class CImpl implements C {

    @Override
    public void testA() {
        System.out.println("CImpl.testA");
    }

    @Override
    public void testB() {
        System.out.println("CImpl.testB");
    }

    @Override
    public void testC() {
        System.out.println("CImpl.testC");
    }
}

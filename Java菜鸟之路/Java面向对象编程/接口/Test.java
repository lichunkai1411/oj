package Java面向对象编程.接口;

public class Test {
    public static void main(String[] args) {
        Angel angel = new Angel();
        angel.fly();
        angel.helpOther();
        System.out.println(Volant.Fly_Hight);

        Volant volant = new Angel();
        volant.fly();

        System.out.println("====测试默认方法===");
        TestDefaultImpl test = new TestDefaultImpl();
        test.printInfo();
        test.moren();
        System.out.println("===测试静态方法===");
        TestDefault.testStatic();

    }
}

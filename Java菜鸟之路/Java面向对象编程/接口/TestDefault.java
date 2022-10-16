package Java面向对象编程.接口;

/**
 * 测试接口中的新特性（默认方法）
 */
public interface TestDefault {
    void printInfo();

    default void moren() {
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法！");
        testStatic();   // 默认方法中可以调用静态方法
    }
    static void testStatic(){
        System.out.println("TestDefault.testStatic");
        }

}

class TestDefaultImpl implements TestDefault {
    @Override
    public void printInfo() {
        System.out.println("TestDefault.printInfo");
    }
}
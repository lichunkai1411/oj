package 内部类;

public class TestAnonymousInnerClass {
    public void test(A a){
        a.run();
    }


    public static void main(String[] args) {
TestAnonymousInnerClass testAnonymousInnerClass = new TestAnonymousInnerClass();
// testAnonymousInnerClass.test(new AImpl());
        testAnonymousInnerClass.test(new A() {      // 创建一个没有名字的匿名实现类
            @Override
            public void run() {
                System.out.println("第一个匿名内部类！");
            }
        });
        testAnonymousInnerClass.test(new A() {
            @Override
            public void run() {
                System.out.println("第二个匿名内部类！");
            }
        });
    }
}
class AImpl implements A{

    @Override
    public void run() {

    }
}
interface A {
    void run();
}

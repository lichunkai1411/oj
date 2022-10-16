package 内部类;

/**
 * 测试内部类用法
 */
public class Outer {
    private int age  = 20;
    public void show() {
        System.out.println("Outer.show");
        System.out.println(age);
    }
    public class Inner{     // 非静态内部类
        int age = 19;
        public void show() {
            System.out.println("Inner.show");
            System.out.println(age);
            System.out.println(Outer.this.age);
            Outer.this.show();
        }
    }
}

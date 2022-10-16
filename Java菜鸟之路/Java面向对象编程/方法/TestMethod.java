package Java面向对象编程.方法;

/**
 * 测试方法的定义和调用
 */
public class TestMethod {
    public static void main(String[] args) {
       // sayLoveU();
        add(10,20,30);
        add(13,34,54);
        sayLoveU();
    }

    public static void sayLoveU() {
        System.out.println("I love You");
        System.out.println("我爱你");
        System.out.println("520");
    }

    public static int add(int a, int b, int c) {  // 形式参数a,b,c
        int sum = a + b + c;
        System.out.println("sum = " + sum);
        return sum;         // return两个作用：返回值，结束方法运行
    }
}

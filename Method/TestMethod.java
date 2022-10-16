public class TestMethod {
    public static void main(String[] args) {
        // sayLoveU();
        add(10,20,30);
        add(100,200,300);
    }

    public static void sayLoveU() {
        System.out.println("I love U");
        System.out.println("我爱你");
        System.out.println("520");
    }

    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("sum = " + sum);
        return sum;     // return两个作用：返回值、结束方法
    }
}
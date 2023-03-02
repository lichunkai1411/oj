package 方法;

/**
 * @Author Lick
 * @date Created in 2022-10-25 13:15
 */
public class Method {
    public static void main(String[] args) {
        Method method = new Method();
        method.printLoveTong();
        method.add(250,250,20);
        int c = method.add(250,250,20)+794;
        System.out.println(c);
    }

    void printLoveTong() {
        System.out.println("彤");
        System.out.println("彤彤");
        System.out.println("郭彦彤");
    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        // return两个作用：1.结束方法的运行。2.返回值
        return sum;
    }
}

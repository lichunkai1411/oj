package 数据类型的转换;

// TODO:测试强制类型转换
public class TestTypeCast {
    public static void main(String[] args) {
        double a = 3.93242;
        int b = (int) a;    // 浮点数强制转换为整数，直接丢失小数部分
        System.out.println(b);

        int c = 97;
        char d = (char) c;
        System.out.println(d);

        // 强制转型，超出了表述范围，会转成一个完全不同的值
        byte e = (byte) 300;
        System.out.println(e);

        // TODO:测试溢出
        int money = 1000000000; //10亿
        int year = 20;
        int total = money * year;
        System.out.println("Total: " + total);

        long total1 = money * year;
        System.out.println("total1:" + total1);

        long total2 = (long) money * year;
//        long total2 = 1L* money*year;
        System.out.println("total2:" + total2);

    }
}

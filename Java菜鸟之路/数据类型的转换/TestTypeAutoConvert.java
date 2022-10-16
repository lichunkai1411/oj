package 数据类型的转换;

// TODO:测试数据类型自动转换
public class TestTypeAutoConvert {
    public static void main(String[] args) {
        // 容量小的类型可以自动转换为容量大的类型
        int a = 3456;
        long b = a;
        // 不兼容类型，会损失精度
        // int c = b;   long类型不能自动转换为int
        double d = b;
        float f = b;

        // 特例：整型常量是int类型，但是可以自动转换为：byte/short/char。
        byte h1 = 123;
        // byte h2 = 1234;  //1234超过了byte的表述范围

        char h3 = 97+25;
        System.out.println(h3);

    }
}

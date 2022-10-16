package 运算符;

/**
 * 测试算数运算符的用法
 */
public class TestOperator01 {
    public static void main(String[] args) {
        int a = 3;
        long b = 4;
        // 运算时有一个为long 需要保存到long类型中
        long c = a + b;
        System.out.println(c);
        double d = 3 + 3.14;
        int e = 32 / 3;  // 两个整数相除直接保留整数部分，没有四舍五入
        // int e = 32.0/3;
        System.out.println(d);
        System.out.println(e);
        int i = 10 % 3;   //取余操作，符号与左边操作数相同
        System.out.println(i);
        // 自增自减
        int j = 30;
        j++;    //相当于：j=j+1;
        j--;    //相当于：j=j-1;

        j = 10;
        int h = j++;        // g++先赋值，再自增
        j = 10;
        int g = ++j;        // ++g先自增，再赋值
        System.out.println(h);
        System.out.println(g);
    }
}

package 运算符;

//TODO:测试位运算
public class TestOperator05 {
    public static void main(String[] args) {
        int a = 7;  // 0111
        int b = 8;  // 1000
        System.out.println(a&b);    // 0000
        System.out.println(a|b);    // 1111 ——>15
        System.out.println(a^b);    // 1111 ——>15
        System.out.println(~b);     // -9

        // 移位
        // 乘以2除以2，使用移位运算最快！！！
        int c = 5<<1;    //5*2
        System.out.println(c);
        System.out.println(40>>3);  // 40/8
    }
}

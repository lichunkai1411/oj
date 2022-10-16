package 运算符;

/**
 * 测试逻辑运算符
 */
public class TestOperator04 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);    // 与:有一个false，结果为false
        System.out.println(b1 | b2);    // 或:有一个true，结果为true
        System.out.println(b1 ^ b2);    // 异或:相同false，不同true
        System.out.println(!b2);        // 取反

        // 短路与、短路或
        // int b3 = 3/0;   // 会报不能除以0的异常
        boolean b3 = 1>2 && (4<3/0);
        System.out.println(b3);
    }
}

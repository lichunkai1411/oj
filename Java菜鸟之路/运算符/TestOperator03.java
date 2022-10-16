package 运算符;

public class TestOperator03 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean c = a > b;
        System.out.println(c);
        char d = 'h';
        // char值位于0～65536之间，可通过(int)强制转型成数字
        System.out.println((int) d);
        boolean e = d > 100;
        System.out.println(e);
    }
}

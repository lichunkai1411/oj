package 运算符;
// TODO:测试字符串连接符的用法
public class TestOperator06 {
    public static void main(String[] args) {
        // int a = 3;
        String a = "3";
        int b = 4;
        System.out.println(a+b);

        // 条件是String，不是char。若是char，则仍然是加法
        char c1 = 'h';
        char c2 = 'i';
        System.out.println(c1+c2);
        // 若想单独连接在前面加一个空字符串
        System.out.println(""+c1+c2);
        // 通过加空字符串，让整个+都变成连接符
    }
}

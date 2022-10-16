package String;

/**
 * 测试字符串
 */
public class TestString {
    public static void main(String[] args) {
        String string = "";  // 空字符串
        String string0 = null;
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");
        System.out.println(string.length());
//        System.out.println(string0.length());  // 会报错：空指针异常
        System.out.println(string1.length());
        System.out.println(string3.length());
        System.out.println(string1==string2);
        System.out.println(string1==string3);
        System.out.println(string1.equals(string3));  // 通常使用equals方法来比较字符串是否相同
    }
}

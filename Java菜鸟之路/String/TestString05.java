package String;

public class TestString05 {
    // 测试字符串
    public static void main(String[] args) {
        String str = null;
        String str2 = "";
        String str3 = "JAVA";
        String str4 = new String("JAVA");
//        System.out.println(str.length());     // 空指针异常
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());

        System.out.println("======字符串相等问题======");
        String g1 = "北京尚学堂";
        String g2 = "北京尚学堂";
        String g3 = new String("北京尚学堂");
        System.out.println(g1 == g2);
        System.out.println(g1 == g3);
        System.out.println(g1.equals(g3));
    }
}

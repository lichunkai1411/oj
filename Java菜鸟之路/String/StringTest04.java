package String;

public class StringTest04 {
    public static void main(String[] args) {
        String s = "";
        String s1 = "How are you?";
        System.out.println(s1.startsWith("How"));   //是否以How开头
        System.out.println(s1.endsWith("you"));    //是否以you结尾
        s = s1.substring(4);        // 提取字符串：从下标为4的位置开始到字符串结尾为止
        System.out.println(s);
        s = s1.substring(4,7);      // 提取字符串：下标为[4，7）不包括7
        System.out.println(s);
        s = s1.toLowerCase();       // 转小写
        System.out.println(s);
        s= s1.toUpperCase();        // 转大写
        System.out.println(s);
        String s2 = "  How old are you? ";
        s=s2.trim();                // 去除字符串首尾空格
        System.out.println(s);
        System.out.println(s2);     // String为不可变字符串，所以s2不变
    }
}

package String;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String s = "";
        String s1 = "How are you?";
        System.out.println(s1.startsWith("How"));    //是否以How开头
        System.out.println(s1.endsWith("you"));    //是否以you结尾
        s = s1.substring(4);    //提取子字符串：从下标为4的位置开始到结尾为止
        System.out.println(s);
        s = s1.substring(4, 7);  //提取子字符串：从下标为[4，7）不包括7为止
        System.out.println(s);
        s = s1.toLowerCase();   // 转小写
        System.out.println(s);
        s = s1.toUpperCase();   // 转大写
        System.out.println(s);
        String s2 = " How old are you? ";
        s = s2.trim();   //去除字符串首尾的空格。（中间空格不去除）
        System.out.println(s);
        System.out.println(s2); //String是不可变字符串，所以s2不变
    }
}

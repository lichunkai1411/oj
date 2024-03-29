package String;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "Hello world";
        System.out.println(s1.charAt(3));   //提取下角标为3的字符
        System.out.println(s2.length());    //获取字符串长度
        System.out.println(s1.equals(s2));  // 比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2)); //比较两个字符串(忽略大小写)
        System.out.println(s1.indexOf("hello Java")); //字符串s1中是否包含Java
        System.out.println(s1.indexOf("hello world")); //字符串s1中是否包含hello world
        System.out.println(s1.equalsIgnoreCase("apple")); //字符串s1中是否包含apple
        String s = s1.replace(' ', '&'); //将s1中的空格替换为&
        System.out.println("更换为：" + s);

    }
}

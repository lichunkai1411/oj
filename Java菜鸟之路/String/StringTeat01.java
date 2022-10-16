package String;

public class StringTeat01 {
    public static void main(String[] args) {
        String string = "core Java";
        String string1 = "Core Java";
        System.out.println(string.charAt(3));   // 提取下标为3的字符
        System.out.println(string1.length());   // 获取字符串长度
        System.out.println(string.equals(string1));  // 表两个字符串是否相等
        System.out.println(string.equalsIgnoreCase(string1));  // 比较两个字符串（忽略大小写）
        System.out.println(string.indexOf("Java"));     //字符串string中是否包含Java
        System.out.println(string.indexOf("apple"));    //字符串string中是否包含apple
        String string3 = "I love java. java is best language! Who love java?";
        System.out.println(string3.indexOf("java"));   // 字符串string3第几个是java从左到右
        System.out.println(string3.lastIndexOf("java")); //  // 字符串string3第几个是java从右到左
        String string2 = string.replace(' ', '&');  //将string2中的空格替换为&
        System.out.println("result: " + string2);
    }
}

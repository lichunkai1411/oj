package 正则表达式;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-18
 * Time：17:13
 */
public class RegexDemo {
    public static void main(String[] args) {


    }

    private static void method3() {
        // 数量
        // ?代表只能出现一次或0次
        String regex = "\\d?";
        System.out.println("1".matches(regex));
        // 零次或多次(任意次数)
        String regex1 = "\\d*";
        System.out.println("12414561".matches(regex1));
        // +代表一次或多次(0次不行)
        String regex2 = "\\d+";
        System.out.println("123".matches(regex2));
        // {n}代表正好n次
        String regex3 = "\\d{3}";
        System.out.println("123".matches(regex3));
        // {n,}代表至少n次
        String regex4 = "\\d{3,}";
        System.out.println("122".matches(regex4));
        // {n,m}代表至少n次但不超过m次
        String regex5 = "\\d{3,5}";
        System.out.println("12345".matches(regex5));
    }

    private static void method2() {
        // 预定义字符类:
        // .任意字符
        String regex = ".";
        System.out.println("1".matches(regex));
        String regex1 = "..";
        System.out.println("11".matches(regex1));
        String regex2 = ".+";
        System.out.println("1".matches(regex2));
        // \d 一个数字: [0-9]
        String regex3 = "\\d";
        System.out.println("2".matches(regex3));
        // \D 非数字: [^0-9]
        String regex4 = "\\D";
        System.out.println("a".matches(regex4));
        // \s 一个空白字符:[ \t\n\x0B\f\r]
        String regex5 = "\\s";
        System.out.println(" ".matches(regex5));
        // \S 非空白字符: [^\s]
        String regex6 = "\\S";
        System.out.println("a".matches(regex6));
        // \w [a-zA-Z_0-9] 英文,数字,下划线
        String regex7 = "\\w";
        System.out.println("a".matches(regex7));
        // \W [^\w] 一个非单词字符
        String regex8 = "\\W";
        System.out.println("!".matches(regex8));
    }

    private static void method1() {
        // 一个字符
        // 只能是a,b,c其中一个
        // []:是对单个字符
        String regex = "[abc]";
        System.out.println("a".matches(regex));
        // 除了a,b,c之外的任何字符
        String regex1 = "[^abc]";
        System.out.println("g".matches(regex1));
        // a到z A到Z 包括(范围)
        String regex2 = "[a-z A-z 0-9]";
        System.out.println("b".matches(regex2));
        // a到d或m到p:([a-dm-p])
        String regex3 = "[a-dm-p]";
        System.out.println("a".matches(regex3));
        // d,e,或f(交集)
        String regex4 = "[a-z&&[def]]";
        System.out.println("f".matches(regex4));
        // a到z,除了b和c:([ad-z]减法)
        String regex5 = "[a-z&&[^bc]]";
        System.out.println("a".matches(regex5));
        // a到z,除了m到p:([a-lq-z]减法)
        String regex6 = "[a-l&&[^q-z]]";
        System.out.println("a".matches(regex6));
    }

}

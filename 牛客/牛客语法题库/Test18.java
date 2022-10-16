package 牛客语法题库;

import java.util.Scanner;

/**
 * 进制A+B
 */
public class Test18 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String aHes = input.next();
    String bOct = input.next();
    int a = Integer.parseInt(aHes.substring(2,aHes.length()));  // 去掉16进制的前两位0x标志位，之后转化为十进制
    int b = Integer.parseInt(bOct.substring(1,bOct.length()));  // 去掉8进制的前两位0标志位，之后转化为十进制
        System.out.println(a+b);
    }
}
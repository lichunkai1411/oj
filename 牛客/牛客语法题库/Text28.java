package 牛客语法题库;

import java.util.Scanner;

/**
 * 给定秒数求小时分秒00:00:00
 */
public class Text28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("多少秒：");
        int x = scanner.nextInt();
        System.out.println("时："+x/3600+"分:"+(x%3600/60)+"秒:"+x%3600%60);


    }
}

package Java入门;

import java.util.Scanner;

/**
 * 四舍五入
 */
public class Text03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想四舍五入的数：");
        double a = input.nextDouble();
        int i = (int)a;
        if ((a-i)>0.5){
            i=i+1;
        }
        System.out.println(i);
    }
}

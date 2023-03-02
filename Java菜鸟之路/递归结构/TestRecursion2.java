package 递归结构;

import java.util.Scanner;

// TODO:使用循环求阶乘
public class TestRecursion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long start = System.currentTimeMillis();// 获取当前时刻
        System.out.println("请输入你需要求的阶乘：");
        int a = input.nextInt();
        long result = 1;
        while (a>1){
            result *= (long) a *(a-1);
            a-=2;
        }
        long end = System.currentTimeMillis();    // 获取当前时刻
        System.out.println(result);
        System.out.println("该循环耗时："+(end-start));
    }
}

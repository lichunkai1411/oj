package 递归结构;

import java.util.Scanner;

/**
 * 测试递归
 */
public class TestRecursion {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();    // 获取当前时刻
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想计算的阶乘：");  // 5
       long result = factorial(input.nextInt());
       long end = System.currentTimeMillis(); // 获取当前时刻
        System.out.println(result);
        System.out.println("该程序运行共耗时："+(end - start)+"ms");  // 获取运行耗时
    }
    // 阶乘：5*4*3*2*1
    public static long factorial(int n) {
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
            // return f(5)->5*f(4)->4*f(3)->3*f(2)->2*f(1)
            // return 1*2*3*4*5
        }
    }
}

package 实例;

import java.util.Objects;
import java.util.Scanner;

/**
 * 个税计算器
 * 通过键盘输入用户的月薪
 * 计算出应缴纳的税款
 * 直到键盘输入exit，退出程序
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入月薪：");
            double monthSalary = input.nextDouble();
            double payable = monthSalary-5000; //应纳税所得额
            double taxable = 0;     //应纳税额
            if (payable<0){
                System.out.println("个税起征点为5000元，不需要纳税（想为国家出份力还需要加把劲！）");
            }else if(payable<=3000){
                taxable=payable*0.03;
                monthSalary-=taxable;
            }else if(payable<=12000){
                taxable=payable*0.1-210;
                monthSalary-=taxable;
            }else if(payable<=25000){
                taxable=payable*0.2-1410;
                monthSalary-=taxable;
            }else if(payable<=35000){
                taxable=payable*0.25-2660;
                monthSalary-=taxable;
            }else if(payable<=55000){
                taxable = payable*0.3-4410;
                monthSalary-=payable;
            }else if(payable<=80000){
                taxable = payable*0.35-7160;
                monthSalary-=payable;
            }else {
                taxable =payable*0.45-15160;
                monthSalary-=payable;
            }
            System.out.println("应纳税所得额："+payable+"元\t"+"纳税税额"+taxable+"元\t"+"实发工资"+monthSalary+"元");
            System.out.println("输入exit退出程序！输入其他继续计算！");
            String comm = input.next();
            if (Objects.equals(comm, "exit")){
                System.out.println("程序结束，退出！");
                break;
            }else {
                continue;
            }
        }
    }
}

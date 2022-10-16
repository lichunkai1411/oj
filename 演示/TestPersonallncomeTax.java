import java.util.Scanner;

public class TestPersonallncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入月薪：");
            double slash = scanner.nextDouble();
            double jiao = slash-5000;
            double shui = 0;
            if(jiao<0){
                System.out.println("个税起征点为5000元，不需要纳税");
            }else if(jiao<=3000){
                shui = jiao*0.03;
                slash = -shui;
            }else if(jiao<=12000){
                shui=jiao*0.1-210;
                slash-=shui;
            }else if(jiao<=25000){
                   shui = jiao*0.2-1410;
                   slash-=shui;
            }else if(jiao<=35000){System.out.println("请输入月薪：");
                    shui = jiao*0.25-2660;
                    slash-=shui;
            }else if(jiao<=55000){
                shui = jiao*0.3-4410;
                slash-=shui;
            }else if(jiao<=80000){
                shui = jiao*0.35-7160;
                slash-=shui;
            }else {
                shui = jiao*0.45-15160;
                slash-=shui;
            }
            System.out.println("应纳税所得额："+jiao+"元\t"+"纳税税额"+shui+"元\t"+"实发工资"+slash+"元");
            System.out.println("输入exit退出程序！其他继续计算！");
            int cmd = scanner.nextInt();
            if (cmd ==88){
                System.out.println("结束程序，退出！");
                break;
            }else {
                continue;
            }
        }
    }
}

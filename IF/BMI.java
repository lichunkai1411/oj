import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的身高：(m)");
        double high = input.nextDouble();
        System.out.println("请输入您的体重：(kg)");
        int weight = input.nextInt();
        double BMI = weight/(Math.pow(high,2));
        if (BMI<18.5){
            System.out.println("过轻！");
            System.out.println("多吃一点！");
        }else if (BMI>=18.5&&BMI<=25){
            System.out.println("正常！");
            System.out.println("你很健康，继续保持！");
        }else if (BMI>25&&BMI<=28){
            System.out.println("过胖！");
            System.out.println("要注意了！");
        }else if (BMI>28&&BMI<=32){
            System.out.println("肥胖！");
            System.out.println("注意饮食！");
        }else if (BMI>32){
            System.out.println("非常肥胖！");
            System.out.println("你应该多运动，不然的话会没有朋友！");
        }else {
            System.out.println("您输入的BMI数值错误！");
        }
    }
}

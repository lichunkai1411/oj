import java.util.Scanner;

public class Text1044 {
    // 健康吗
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // 接收用户输入的身高体重
        double height = scan.nextDouble();
        double weight = scan.nextDouble();
        // 如果身高体重大于0
        if (height > 0 && weight > 0){
            // BMI=体重除以身高的平方
            // 将计算出的结果保存到bmi中
            double bmi = weight / (height * height);
            // 如果bmi大于等于20并且bmi小于等于25
            if (bmi >= 20 && bmi <= 25) {
                // 打印健康
                System.out.println("健康");
                // 否则
            } else {
                // 打印不健康
                System.out.println("不健康");
            }
            // 否则
        }else{
            // 打印error
            System.out.println("error");
        }
    }
}
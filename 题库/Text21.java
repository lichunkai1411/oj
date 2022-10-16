import java.util.Scanner;

public class Text21 {
    // 平均成绩评级
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        // 读取用户输入的三门课程成绩
        double chinese = score.nextDouble();
        double math = score.nextDouble();
        double english = score.nextDouble();
        // 将三门课程成绩除以3求出平均值
        double average = (chinese + math + english) / 3;
        // 如果大于90
        if (average > 90) {
            // 输出"zhuoyue"
            System.out.println("zhuoyue");
            // 否则如果平均值大于80
        } else if (average > 80) {
            // 输出"youxiu"
            System.out.println("youxiu");
            // 否则如果平均值大于70
        } else if (average > 70) {
            // 输出"lianghao"
            System.out.println("lianghao");
            // 否则如果平均值大于等于60
        } else if (average >= 60) {
            // 输出"hege"
            System.out.println("hege");
            // 否则
        } else {
            // 输出"buhege"
            System.out.println("buhege");
        }
    }
}
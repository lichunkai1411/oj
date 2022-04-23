import java.util.Scanner;

public class Text21 {
    // 平均成绩评级
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        double chinese = score.nextDouble();
        double math = score.nextDouble();
        double english = score.nextDouble();
        double average = (chinese + math + english) / 3;
        // 读取用户输入的三门课程成绩除以3求出平均值
        if (average > 90) {
            // 如果大于90
            System.out.println("zhuoyue");
            // 输出"zhuoyue"
        } else if (average > 80) {
            // 否则如果平均值大于80
            System.out.println("youxiu");
            // 输出"youxiu"
        } else if (average > 70) {
            // 否则如果平均值大于70
            System.out.println("lianghao");
            // 输出"lianghao"
        } else if (average >= 60) {
            // 否则如果平均值大于等于60
            System.out.println("hege");
            // 输出"hege"
        } else {
            // 否则
            System.out.println("buhege");
            // 输出"buhege"
        }
    }
}
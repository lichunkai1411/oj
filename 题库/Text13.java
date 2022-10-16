import java.util.Scanner;

public class Text13 {
    // 整除问题
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入
        double number = input.nextDouble();
        // 如果小于10并且不能被2和3整除
        if (number < 10 && number % 2 != 0 && number % 3 != 0) {
            // 输出"yes"
            System.out.println("yes");
            // 否则
        } else {
            // 输出"no"
            System.out.println("no");
        }
    }
}
import java.util.Scanner;

public class Text1035 {
    // 是否及格
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的成绩
        int score = input.nextInt();
        // 进入if循环
        // 判断成绩是否大于60
        // 如果大于100或者小于0
        if (score>100||score<0){
            // 输出打印error
            System.out.println("error");
            // 否则如果成绩大于等于60
        }else if (score>=60){
            // 输出打印合格
            System.out.println("合格");
            // 否则
        }else {
            // 输出打印不及格
            System.out.println("不及格");
        }
    }
}

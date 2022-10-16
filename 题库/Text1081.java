import java.util.Scanner;

public class Text1081 {
    // 证书等级
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 接收学生成绩
        double score = sc.nextDouble();
        // 如果成绩大于100或者小于0
        if (score < 0 || score > 100) {
            // 输出打印error
            System.out.println("error");
            // 否则
        } else {
            // 如果成绩小于60
            if (score < 60) {
                // 输出打印不合格
                System.out.println("不合格");
                // 否则如果成绩大于等于60并且小于80
            } else if (score >= 60 && score < 80) {
                // 输出打印初级
                System.out.println("初级");
                // 否则如果初级大于等于80并且小于95
            } else if (score >= 80 && score < 95) {
                // 输出打印中级
                System.out.println("中级");
                // 否则如果初级大于等于95并且小于100
            } else if (score >= 95 && score < 100) {
                // 输出打印高级
                System.out.println("高级");
            }
        }

    }
}
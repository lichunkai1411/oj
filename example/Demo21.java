import java.util.Scanner;

public class Demo21 {
    // do-while循环
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("张浩开始写编程作业");
            System.out.println("张浩写完作业！合格了吗？yes/no");
            choice = scanner.next();
        } while ("no".equals(choice));
        System.out.println("恭喜你完成任务!");
    }
}


import java.util.Scanner;

public class Demo5 {
    // switch-case结构（1）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "第一名":
                System.out.println("奖励夏令营！");
                break;
            case "第二名":
                System.out.println("奖励笔记本！");
                break;
            case "第三名":
                System.out.println("奖励硬盘！");
                break;
            default:
                System.out.println("什么都没有！");
                break;
        }
    }
}

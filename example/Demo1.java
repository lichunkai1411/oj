import java.util.Scanner;

public class Demo1 {
    // 字符串相等判断
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：男 女");
        String sex = scanner.next();
        if ("男".equals(sex)){
            System.out.println("奖励一台iPhone");
        }else if ("女".equals(sex)){
            System.out.println("奖励一台iPad");
        }else {
            System.out.println("输入错误");
        }
    }
}

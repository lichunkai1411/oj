import java.util.Scanner;

public class Text1073 {
    // 打印正方形
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a <= 0) {
            System.out.println("error");
        }else {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                if (i == a - 1) {
                    break;
                } else {
                    System.out.println();
                }
            }
        }

    }
}
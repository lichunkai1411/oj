import java.util.Scanner;

public class Text1074 {
    // 打印矩形
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b < 1 || a < b) {
            System.out.println("error");
        }else {
            for (int i = 0; i < b; i++) {
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
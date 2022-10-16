import java.util.Scanner;

public class Text1062 {
    // 找最大值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int max = 0;
        if(m <= 0) {
            System.out.println("error");
        }else {
            for (int i = 0; i < m; i++) {
                int temp = scanner.nextInt();
                if(i == 0) {
                    max = temp;
                }else {
                    if(temp >= max) {
                        max = temp;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
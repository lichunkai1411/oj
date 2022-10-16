import java.util.Scanner;

public class Text1063 {
    // 求最小值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int min = 0;
        if(m <= 0) {
            System.out.println("error");
        }else {
            for (int i = 0; i < m; i++) {
                int temp = sc.nextInt();
                if(i == 0) {
                    if (temp < 0) {
                        min = temp;
                    }
                }else {
                    if(temp <= min) {
                        min = temp;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
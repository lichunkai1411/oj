import java.util.Scanner;
public class Text1049 {
    // 打印后5个数字
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int b;
        int a = scan.nextInt();
        while (x<5){
            x++;
            b = a+x;
            System.out.println(b);
        }
    }
}
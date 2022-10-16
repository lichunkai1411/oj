import java.util.Scanner;

public class Text1029 {
    // 椭圆周长
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 获取用户输入的长半轴
        int longaxis = scan.nextInt();
        // 获取用户输入的短半轴
        int shortaxis = scan.nextInt();
        //perimeter=2πshortaxis+4(longaxis-shortaxis)
        System.out.println(2 * 3.14 * longaxis + 4 * shortaxis - 4 * longaxis);
    }
}
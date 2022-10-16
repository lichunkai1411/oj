import java.util.Scanner;

public class Text10126 {
    public static void main(String[] args) {
        // 接收用户输入的长短半轴
        Scanner input = new Scanner(System.in);
        // 定义半径
        double R = 3.14;
        // 接收长半轴
        double Long_half = input.nextDouble();
        // 接收短半轴
        double Short_half = input.nextDouble();
        System.out.println(R * Long_half * Short_half);
    }
}
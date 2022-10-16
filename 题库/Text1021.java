import java.util.Scanner;

public class Text1021 {
    // 三角形周长
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入的三条边长
        int sidea = input.nextInt();
        int sideb = input.nextInt();
        int sidec = input.nextInt();
        // 将三条边长之和赋值给perimeter
        int perimeter =(sidea+sideb+sidec);
        // 输出打印perimeter
        System.out.println(perimeter);
    }
}

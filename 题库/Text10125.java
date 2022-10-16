import java.util.Scanner;

public class Text10125{
    public static void main(String [] args){
        // 接受用户输入
        Scanner input = new Scanner(System.in);
        // 接受半径
        double r = input.nextDouble();
        // 接受高度
        double h = input.nextDouble();
        // 输出表面积
        System.out.println(2 * 3.14 * r * r + 2 * 3.14 * r * h);
    }
}
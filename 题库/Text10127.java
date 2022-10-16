import java.util.Scanner;

public class Text10127{
    public static void main(String [] args){
        // 接受用户输入
        Scanner input = new Scanner(System.in);
        // 将用户输入的半径赋值给r
        double r = input.nextDouble();
        // 输出表面积
        System.out.println(4 * 3.14 *r*r );
    }
}
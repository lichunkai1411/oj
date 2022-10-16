import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int number = input.nextInt();
        int count = 0;
        do {
            number = number / 10;
            count = count + 1;
            // TODO:调试 System.out.println("number="+number+"count="+count);
        } while (number != 0);
        {
            System.out.println(count);
        }
    }
}

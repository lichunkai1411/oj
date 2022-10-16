import java.util.Scanner;
public class Exe3 {
    // 华氏温度转换为摄氏温度
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int F = input.nextInt();
        int C = (int) ((F-32)/1.8);
        System.out.println(C);
    }
}

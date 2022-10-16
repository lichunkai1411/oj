import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = 1;
        for (int i = 2; i <=a&&i<=b ; i++) {
            if (a%i==0&&b%i==0){
                result=i;
            }
        }
        System.out.printf(a+"和"+b+"的最大公约数是"+result);
    }
}

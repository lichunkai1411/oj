import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int oa = a;
        int ob = b;
        while (b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        System.out.println(oa+"和"+ob+"的最大公约数是"+a);
    }
}

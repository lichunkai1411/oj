import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        while (count>0){
            System.out.println(count);
            count=count-1;
        }
        System.out.println(count);
        System.out.println("发射!");
    }
}

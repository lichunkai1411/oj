import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double sum = 0.0;
        int sigh = 1;
        for (int i = 1; i <=num ; i++) {
            if (i%2==1){
                sum+=1.0/i;
            }else {
                sum-=1.0/i;
            }
        }
        System.out.printf("%.2f",sum);
    }
}

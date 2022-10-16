import java.util.Scanner;

public class Add {
   public static void sum(int a,int b){
       int sum = 0;
       for (int i = 0; i <=b ; i++) {
           sum+=i;
       }
       System.out.println(a+"到"+b+"的和是"+sum);
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sum(1,10);
        sum(20,30);
        sum(35,45);
    }
}

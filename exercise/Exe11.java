import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1);
        int a ;
        int count = 0;
        do {
            a = input.nextInt();
            count = count+1;
            if (a>number){
                System.out.println("大了");
            }else if (a<number){
                System.out.println("小了");
            }
        }while (a!=number);
        System.out.println("恭喜你答对了，你猜了"+count+"次");
    }
}
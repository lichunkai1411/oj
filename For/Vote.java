import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请为你心目中的同学投票：");
        int[]numbers = new int[10];
        int x= input.nextInt();
        while (x!=-1){
            if (x>=0&&x<=9){
                numbers[x]++;
            }
            x=input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+":"+numbers[i]);
        }
    }
}
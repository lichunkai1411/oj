package Java入门;

import java.util.Scanner;

public class Text05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Money = input.nextInt();
        int count = 0;
       if (Money >= 5000){
           count = (int) (Money*0.6);
       }else if (Money >= 2000){
           count = (int) (Money*0.7);
       }else if (Money >= 500){
           count = (int) (Money*0.8);
       }else if (Money >= 100){
           count = (int) (Money*0.9);
       }else {
           count = Money;
       }
        System.out.println(count);
    }
}

package Java入门;

import java.util.Scanner;

public class Text06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double width = input.nextDouble();
        double index = width/(Math.pow(height,2));
        if (index < 18.5){
            System.out.println("偏瘦");
        }else if (index >=18.5&&index< 20.9){
            System.out.println("苗条");
        }else if (index >=20.9&&index<=24.9){
            System.out.println("适中");
        }else if (index >=24.9){
            System.out.println("偏胖");
        }
    }
}

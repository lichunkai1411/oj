package Java入门;

import java.util.Scanner;

public class Text07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if(line.equals("A")){
            System.out.println("优秀");
        }else if(line.equals("B")){
            System.out.println("良好");
        }   else if(line.equals("C")){
            System.out.println("及格");
        }else if(line.equals("D")){
            System.out.println("不及格");
        }else {
            System.out.println("未知等级");
        }
    }
}

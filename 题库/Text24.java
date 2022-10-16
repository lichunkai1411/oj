import java.util.Scanner;

public class Text24 {
    // 降序数判断
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的一个百位数
        int hundred = input.nextInt();
        // 这个百位数对10取余求出个位
        int single = hundred % 10;
        // 这个数除以10再对10取余求出十位
        int ten = hundred / 10 % 10;
        // 这个数除以100求出百位
        int hundreds = hundred / 100;
        // 如果百位大于十位并且十位大于个位
        if (hundreds > ten && ten > single) {
            // 输出"yes"
            System.out.println("yes");
            // 否则
        } else {
            // 输出"no"
            System.out.println("no");
        }
    }
}
import java.util.Scanner;

public class Text24 {
    // 降序数判断
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int hundred = enter.nextInt();
        // 读取用户输入的一个百位数
        int single = hundred % 10;
        // 这个百位数对10取余求出个位
        int ten = hundred / 10 % 10;
        // 这个数除以10再对10取余求出十位
        int hundreds = hundred / 100;
        // 这个数除以100求出百位
        if (hundreds > ten && ten > single) {
            // 如果百位大于十位并且十位大于个位
            System.out.println("yes");
            // 输出"yes"
        } else {
            // 否则
            System.out.println("no");
            // 输出"no"
        }
    }
}
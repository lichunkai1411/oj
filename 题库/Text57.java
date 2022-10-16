import java.util.Scanner;

public class Text57 {
    // 这是水吗
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner scanner = new Scanner(System.in);
        // 接收用户输入的字符串
        String str = scanner.next();
        // 将字符串转换为字符数组
        char[] chars = str.toCharArray();
        boolean Num = false;
        boolean other = false;
        int H = 0;
        int O = 0;
        int j = 0;
        while (j < chars.length) {
            char i = chars[j];
            if (Character.isDigit(i)) Num = true;
            else if (i == 'H') {
                H++;
            } else if (i == 'O') {
                O++;
            } else {
                other = true;
            }
            j++;
        }
        // 如果有数字
        if (Num) {
            System.out.println("你的输入中包含数值");
            // 否则如果有其他元素
        } else if (other) {
            System.out.println("这不是构成水分子的基础原子");
            // 否则如果H等于二倍O 并且H大于0 并且O大于0
        } else if (H == O * 2 && H > 0 && O > 0) {
            System.out.println("这是水分子");
        } else {
            System.out.println("这不是水分子");
        }
    }
}
import java.util.Scanner;

public class Text31 {
    // 判断颜色
    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        int red = color.nextInt();
        int green = color.nextInt();
        int blue = color.nextInt();
        // 如果红色等于0并且绿色等于0并且蓝色等于0
        if (red == 0 && green == 0 && blue == 0) {
            // 三个值如果都为0输出"black"
            System.out.println("black");
            // 否则如果都为225
        } else if (red == 255 && green == 255 && blue == 255) {
            // 输出"white"
            System.out.println("white");
            // 否则如果红色为255
        } else if (red == 255 && (green == 0) && (blue == 0)) {
            // 输出"red"
            System.out.println("red");
            // 否则如果绿色为255
        } else if ((red == 0) && (green == 255) && (blue == 0)) {
            // 输出"green"
            System.out.println("green");
            // 否则如果蓝色为255
        } else if ((red == 0) && (green == 0) && (blue == 255)) {
            // 输出"blue"
            System.out.println("blue");
            // 否则
        } else {
            // 输出"other color"
            System.out.println("other color");
        }
    }
}
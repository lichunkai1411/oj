import java.util.Scanner;

public class Text31 {
    // 判断颜色
    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        int red = color.nextInt();
        int green = color.nextInt();
        int blue = color.nextInt();
        if (red == 0 && green == 0 && blue == 0) {
            System.out.println("black");
            // 接收用户输入的三个值如果都为0输出"black"
        } else if (red == 255 && green == 255 && blue == 255) {
            System.out.println("white");
            // 否则如果都为225输出"white"
        } else if (red == 255 && (green == 0) && (blue == 0)) {
            System.out.println("red");
            // 否则如果红色为255输出"red"
        } else if ((red == 0) && (green == 255) && (blue == 0)) {
            System.out.println("green");
            // 否则如果绿色为255输出"green"
        } else if ((red == 0) && (green == 0) && (blue == 255)) {
            System.out.println("blue");
            // 否则如果蓝色为255输出"blue"
        } else {
            System.out.println("other color");
            // 否则输出"other color"
        }
    }
}
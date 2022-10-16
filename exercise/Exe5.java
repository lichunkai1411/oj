import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        int MINOR = 35;
        System.out.println("请输入你的年龄");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("你的年龄是："+age);
        if (age<MINOR){
            System.out.println("年轻是美丽的");
        }
        System.out.println("年龄决定了你的精神世界，好好珍惜吧。");
    }
}

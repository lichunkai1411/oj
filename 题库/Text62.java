import java.util.Scanner;

public class Text62 {
    // 函数输出时长
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的两个整数
        int a = input.nextInt();
        int b = input.nextInt();
        // 输出打印将输入参数通过计时器方法传递给vectormul
        System.out.println("输出时长为" + vectormul(a, b) + "秒!");
    }
    // 调用vectormul方法
    public static int vectormul(int a, int b) {
        // 初始化浮点数
        double floatnumaber = 0;
        // for循环
        for (int i = 0; i <= b; i++) {
            // 浮点数+0.01再赋值给浮点数
            floatnumaber += 0.01;
        }
        // 返回字符串
        return (int) floatnumaber;
    }

}
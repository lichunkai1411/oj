import java.util.Scanner;

public class Text1040 {
    // 第几象限
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入左边
        int x = input.nextInt();
        int y = input.nextInt();
        // 进入if循环
        // 判断x轴y轴坐标
        // 如果x大于0并且y大于0
        if (x>0&&y>0){
            // 输出打印1
            System.out.println("1");
            // 否则如果x小于0并且y大于0
        }else if (x<0&&y>0){
            // 输出打印2
            System.out.println("2");
            // 否则如果x小于0并且y大于0
        }else if (x<0&&y<0){
            // 输出打印3
            System.out.println("3");
            // 否则如果x大于0并且y小于0
        }else if (x>0&&y<0){
            // 输出打印4
            System.out.println("4");
            // 否则
        }else {
            // 输出打印error
            System.out.println("error");
        }

    }
}

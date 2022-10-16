import java.util.Scanner;

public class text1041 {
    // 什么颜色
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入
        int color1 = input.nextInt();
        int color2 =input.nextInt();
        int color3=input.nextInt();
        // 进入if循环
        // 判断三个颜色的值
        // 如果都为0
        if (color1==0&&color2==0&&color3==0){
            // 输出打印black
            System.out.println("black");
            // 否则如果第一个为255其他为0
        }else if (color1==255&&color2==0&&color3==0){
            // 输出打印红色
            System.out.println("red");
            // 否则如果第二个为255其他为0
        }else if (color1==0&&color2==255&&color3==0){
            // 输出打印绿色
            System.out.println("green");
            // 否则如果第三个为255其他为0
        }else if (color1==0&&color2==0&&color3==255){
            // 输出打印蓝色
            System.out.println("blue");
            // 否则如果都为255
        }else if (color1==255&&color2==255&&color3==255){
            // 输出打印白色
            System.out.println("white");
            // 否则
        }else {
            // 输出打印其他颜色
            System.out.println("other color");
        }
    }
}

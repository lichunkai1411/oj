import java.util.Scanner;

public class Text28 {
    // 碰撞检测
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 接收一个坐标
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // 接收一个半径
        double radius1 = input.nextDouble();
        // 接收另一个坐标
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        // 接收另一个半径
        double radius2 = input.nextDouble();
        //导入数学运算的方法求出两点间距离
        double sum = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        // 如果两点间距离大于半径1和半径2之和
        if (sum > radius1 + radius2) {
            // 输出"no"
            System.out.println("no");
            // 否则
        } else {
            // 输出"yes
            System.out.println("yes");
        }
    }
}
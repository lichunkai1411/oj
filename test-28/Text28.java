import java.util.Scanner;

public class Text28 {
    // 碰撞检测
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        // System.out.println("请输入圆1的坐标和半径：");
        double x1 = enter.nextDouble();
        double y1 = enter.nextDouble();
        double radius1 = enter.nextDouble();
        // 读取用户输入的坐标和半径1
        // System.out.println("请输入圆2的坐标和半径：");
        double x2 = enter.nextDouble();
        double y2 = enter.nextDouble();
        double radius2 = enter.nextDouble();
        // 读取用户输入的坐标和半径2
        // double sum=Math.sqrt((x1-x2)*(x1-x2+(y1-y2)*(y1-y2)));
        double sum = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        //导入数学运算的方法求出两点间距离
        if (sum > radius1 + radius2) {
            // 如果两点间距离大于半径1和半径2之和
            System.out.println("no");
            // 输出"no"
        } else {
            // 否则
            System.out.println("yes");
            // 输出"yes
        }
    }
}
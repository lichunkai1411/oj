package Java面向对象编程.构造方法;

import java.util.Scanner;

/**
 * 定义一个"点"Point类用来表示二维空间中的点（两个坐标）
 * 1.可以生成具有特定坐标的对象
 * 2.提供可以计算该"点"距离的方法
 */
public class DemoPoint {
    double x, y;
    // 构造器   类名后加()
    DemoPoint(double _x, double _y) {    // 加下划线的目的是区分上面的x，y
        x = _x;
        y = _y;
    }
    // 获取距离
    public double getDistance(DemoPoint p) {
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入点的坐标：");
        DemoPoint p1 = new DemoPoint(input.nextDouble(),input.nextDouble());
        DemoPoint p2 = new DemoPoint(0.0,0.0);
        System.out.println("该点距原点距离："+p1.getDistance(p2));
    }
}

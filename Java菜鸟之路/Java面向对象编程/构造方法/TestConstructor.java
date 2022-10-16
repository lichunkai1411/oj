package Java面向对象编程.构造方法;

class Point{
    double x, y;
    // 构造方法名称和类名必须保持一致
    public Point(double x, double y) {
        x = x;
        y = y;
    }
    public double getDistance(DemoPoint p) {
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}
public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        DemoPoint origin = new DemoPoint(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }
}

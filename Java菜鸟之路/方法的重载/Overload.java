package 方法的重载;

/**
 * @Author Lick
 * @date Created in 2022-10-25 13:32
 */
public class Overload {
    public static void main(String[] args) {
        System.out.println(add(2,1));
    }
    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }
    // 参数数量不同构成重载
    public static int add(int x,int y,int z){
        int sum = x+y+z;
        return sum;
    }
    // 参数类型不同重载
    public static double add(double x,int y){
        double sum = x+y;
        return sum;
    }
//    参数顺序不同构成重载
    public static double add(int x,double y){
        double sum = x+y;
        return sum;
    }
}

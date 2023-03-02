package 方法;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-24
 * Time：13:49
 *
 * @author lck
 */
public class MethodTest2 {
    public static void main(String[] args) {
        int max = getMax(10, 20, 30);
        System.out.println(max);
        int min = getMin(10, 20, 30);
        System.out.println(min);
    }

    private static int getMin(int num1, int num2, int num3) {
        int temp = num1 < num2 ? num1 : num2;
        int min = temp < num3 ? temp : num3;
        return min;
    }

    public static int getMax(int num1, int num2, int num3) {
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;

        return max;
    }
}

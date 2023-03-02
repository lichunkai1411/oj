package 方法;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-24
 * Time：13:49
 *
 * @author lck
 */
public class MethodTest {
    public static void main(String[] args) {
    getMax(10,20);
    }

    public static void getMax(int num1,int num2) {
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}

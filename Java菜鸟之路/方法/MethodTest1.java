package 方法;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-24
 * Time：13:49
 *
 * @author lck
 */
public class MethodTest1 {
    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);

    }
    public static int getMax(int num1,int num2){
        int max = num1>num2?num1:num2;
        return max;
    }
}

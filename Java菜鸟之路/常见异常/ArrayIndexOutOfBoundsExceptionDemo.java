package 常见异常;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-27
 * Time：10:35
 * 数组索引越界异常：ArrayIndexOutOfBoundsException
 * 原因：访问了不存在的索引
 * @author lck
 */
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int []arr ={11,22,33};
        for (int i = 0; i < arr.length; i++) {
            // i = 0 1 2 3
            System.out.println(arr[i]);
        }
        System.out.println(arr[10]);
    }
}

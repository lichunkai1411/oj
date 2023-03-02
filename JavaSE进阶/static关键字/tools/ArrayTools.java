package static关键字.tools;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：17:38
 *
 * @author lck
 */

/**
 *      需求：编写一个类ArrayTools内部编写三个方法
 *          1.从数组中找最大值
 *          2.从数组中找最小值
 *          3.打印出数组中所有的元素，格式要求为 [11,22,33]
 * @author lck
 */
public class ArrayTools {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}

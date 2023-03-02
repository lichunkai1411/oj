package Java基础案例.数组元素反转;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：12:38
 *
 * @author lck
 */
public class Test5 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        reverseArray1(arr);
//        reverseArray2(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseArray2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    private static void reverseArray1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

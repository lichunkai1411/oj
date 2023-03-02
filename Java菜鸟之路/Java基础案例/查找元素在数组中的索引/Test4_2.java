package Java基础案例.查找元素在数组中的索引;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：12:07
 *
 * @author lck
 */
public class Test4_2 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50,19,19};
        int[] results = getIndex(19, arr);
        if (results.length == 0) {
            System.out.println("您要查找的元素，在数组中不存在");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
            }
        }
    }

    public static int[] getIndex(int num, int[] arr) {
        // 1.统计要查找的元素，在数组中出现的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        // 2.根据统计出来的个数，创建数组容器
        int[] results = new int[count];
        int index = 0;
        // 3.查找元素在数组中的索引，将找到的索引，存入数组容器
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                results[index] = i;
                index++;
            }
        }
        // 4.将装满了索引的数组，返回
        return results;
    }
}

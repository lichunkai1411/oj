import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-24
 * Time：10:36
 */
public class Funsion_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];  // 定义数组a，大小为100
        int n = 0;  // 定义变量n用于记录数组a中元素的个数
        System.out.println("请输入一组数字（以','或';'分割）：");
        String line = scanner.nextLine();

        // 将字符串按','或';'分割为数字字符串数组
        String[] nums = line.split("[,;]");

        // 将数字字符串转换为数字，并添加到数组a中
        for (String num : nums) {
            try {
                a[n++] = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("输入的不是数字！");
                return;
            }
        }

        // 判断数组a是否为Fusion Array
        boolean isFusion = true;
        for (int i = 1; i < n; i++) {
            if (a[i-1] % a[i] != 0) {
                isFusion = false;
                break;
            }
        }

        if (isFusion) {
            System.out.println("是");
        } else {
            System.out.println("否");
        }
    }
    }









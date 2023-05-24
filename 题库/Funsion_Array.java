import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-28
 * Time：17:50
 */
public class Funsion_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (!input.contains(",")) {  // 没有合法分割符
            System.out.println("没有合法分割符");
            return;
        }
        String[] nums = input.split(",");
        if (nums.length < 2) {  // 数组元素数量小于2，不是Fusion Array
            System.out.println("否");
            return;
        }
        try {
            int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);  // 将字符串转换为整数
            }
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] % arr[i - 1] != 0) {  // 判断是否为Fusion Array
                    System.out.println("否");
                    return;
                }
            }
            System.out.println("是");
        } catch (NumberFormatException e) {  // 输入不是数字
            System.out.println("不是数字");
        }
    }
}

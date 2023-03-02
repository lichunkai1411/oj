package API.包装类.Integer;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-17
 * Time：10:29
 */

/**
 * 已知字符串 String s = "10.50,30,20,40";
 * 请将该字符串转换为整数并存入数组
 * 随后求出最大值打印在控制台
 */
public class IntegerTest {
    public static void main(String[] args) {
        String s = "10,50,30,20,40";
        // 1.根据逗号做切割
        String[] split = s.split(",");
        // 2.准备一个整数数组,准备存储转换后的数字
        int[]nums = new int[split.length];
        // 3.遍历字符串数组
        for (int i = 0; i < split.length; i++) {
            // 每一个数字字符串
            // 4.将数字字符串转换为整数,并存入数组
            nums[i]= Integer.parseInt(split[i]);
        }
        // 5.求最大值
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("最大值为:"+max);
    }
}

import java.util.Scanner;

public class Text56 {
    // 移除元素
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 定义数组nums
        int[] nums = new int[8];
        // 定义num等于0
        int num = 0;
        // 进入for循环
        // 获取数组长度
        for (int i = 0; i < nums.length; i++) {
            // 接收输入保存到数组i
            nums[i] = input.nextInt();
        }
        // 将输入的整数保存到变量val中
        int val  = input.nextInt();
        // 进入for循环
        // 读取数组
        for (int i = 0; i < nums.length; i++) {
            // 如果数组i等于这个整数
            if (nums[i]==val){
                num++;
            }
        }
        // 输出打印数组长度减去这个数
        System.out.println(nums.length-num);
    }
}
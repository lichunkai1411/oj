import java.util.Scanner;

public class Text1099 {
    // 二进制转十进制
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 声明一个长度为5的数组
        int[] array = new int[5];
        // 进入for循环
        // 从第一为到尾部
        for (int i = 0; i < array.length; i++) {
            // 循环接收用户输入的5个数保存到数组中
            array[i] = input.nextInt();
        }
        //如果数组第一位等于1
        if (array[0] == 1) {
            // 将16保存到第一位的位置
            array[0] = 16;
            // 否则如果第一位等于0
        } else if (array[0] == 0) {
            // 将0保存到第一位
            array[0] = 0;
        }
        // 如果第二位等于1
        if (array[1] == 1) {
            // 将8保存到第二位
            array[1] = 8;
            // 否则如果第二位等于0
        } else if (array[1] == 0) {
            // 将0保存到第二位
            array[1] = 0;
        }
        // 如果第三位等于1
        if (array[2] == 1) {
            // 将4保存到第三位
            array[2] = 4;
            // 否则如果第三位等于0
        } else if (array[2] == 0) {
            // 将0保存到第三位
            array[2] = 0;
        }
        // 如果第四位等于1
        if (array[3] == 1) {
            // 将2保存到第4位
            array[3] = 2;
            // 否则如果第四位等于0
        } else if (array[3] == 0) {
            // 将0保存到第四位
            array[3] = 0;
        }
        // 如果第五位等于1
        if (array[4] == 1) {
            // 将1保存到第五位
            array[4] = 1;
            // 否则如果第五位等于0
        } else if (array[4] == 0) {
            // 将0保存到第五位
            array[4] = 0;
        }
        // 输出打印
        System.out.println(array[0] + array[1] + array[2] + array[3] + array[4]);
    }
}
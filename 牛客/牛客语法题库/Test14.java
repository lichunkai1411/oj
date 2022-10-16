package 牛客语法题库;

import java.util.Scanner;

/**
 * 按照格式输入并交换输出
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请以a=……，b=……格式输入");
        String nums = input.nextLine();
        String[] twoNums = nums.split(","); // 用，隔开两个数
        // substring() 方法返回字符串的子字符串。
        System.out.println(twoNums[0].substring(0, 2) + twoNums[1].substring(2) + "," + twoNums[1].substring(0, 2) + twoNums[0].substring(2));
    }
}

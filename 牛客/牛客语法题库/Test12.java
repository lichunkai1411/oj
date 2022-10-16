package 牛客语法题库;

import java.util.Scanner;

/**
 * 学生基本信息输入输出
 */
public class Test12 {
    public static void main(String[] args) {
        // 获取输入
        Scanner input = new Scanner(System.in);
        // 将获取的数组保存到字符串变量string中
        String string = input.nextLine();
        // 获取学号
        String student_id = string.substring(0, string.indexOf(";"));
        // 使用分割函数获取分数
        // 使用format函数实现保留两位小数并实现四舍五入
        String[] score = string.substring(string.indexOf(";") + 1).split(",");
        for (int i = 0; i < score.length; i++) {
            // 不能对字符串直接操作，所以转换一下float
            float aFloat = Float.parseFloat(score[i]);
            // 保留两位小数
            score[i] = String.format("%.2f", aFloat);
        }
        // 数据修改后再转成字符串并输出
        String result = String.join(",", score);
        System.out.println("The each subject score of No." + student_id + " is: " + result + ".");
    }
}
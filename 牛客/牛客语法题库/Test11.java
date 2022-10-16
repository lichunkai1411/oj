package 牛客语法题库;

import java.util.Scanner;

/**
 * 成绩输入输出
 */
public class Test11 {
    public static void main(String[] args) {
        // 接受输入
        Scanner input = new Scanner(System.in);
        // 使用数组存放三科成绩
        int [] score = new int[3];
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        // 遍历数组
        for (int i = 0; i < score.length; i++) {
            System.out.print("score"+(i+1)+"="+score[i]);
            // 最后一个成绩不需要逗号
            if (i< score.length-1){
                System.out.print(",");
            }
        }
    }
}

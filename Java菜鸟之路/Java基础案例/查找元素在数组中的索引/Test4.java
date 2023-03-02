package Java基础案例.查找元素在数组中的索引;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：11:55
 * @author lck
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr =  {19,28,37,46,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的元素：");
        int num = scanner.nextInt();
        int index = getIndex(num, arr);
        System.out.println(index);
    }
    public static int getIndex(int num,int[]arr){
        // 1.假设要查找的元素，在数组中就是不存在的
        int index = -1;
        // 2.遍历数组，获取内部的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 3.比较
            if (arr[i] == num){
                // 4.找到了，让Index变量记录正确的索引位置
                index = i;
                break;
            }
        }
        return index;
    }
}

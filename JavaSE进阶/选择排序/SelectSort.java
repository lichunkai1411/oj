package 选择排序;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-18
 * Time：12:24
 */

import java.util.Arrays;

/**
 * 选择排序:从0号索引开始,拿着每一个索引上的元素跟后面的元素依次比较
 *
 * 第一轮 : arr[0]-arr[1] arr[0]-arr[2] arr[0]-arr[3] arr[0]-arr[4]
 * 第二轮 : arr[1]-arr[2] arr[1]-arr[3] arr[1]-arr[4]
 * 第三轮 : arr[2]-arr[3] arr[2]-arr[4]
 * 第三轮 : arr[3]-arr[4]
 */
public class SelectSort {
    public static void main(String[] args) {
        int []arr= {22,11,44,33,55};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

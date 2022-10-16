package com.itbaizhan;
// 使用Arrays类对数组进行填充
import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        int [] a = {12,53,565,34,87,23,46,43,42,34,435};
        Arrays.fill(a,2,3,100); //将索引为2的数字替换为100(2，3  不包括3  4，6   不包括6)
        System.out.println(Arrays.toString(a));
    }
}

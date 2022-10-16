package com.itbaizhan;

import java.util.Arrays;

// 二分法查找法
public class Test07 {
    public static void main(String[] args) {
        int [] a = {12,53,565,34,87,23,46,43,42,34,435};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 返回排序后新的索引位置，若未找到返回负数
        System.out.println("这个元素的索引为:"+Arrays.binarySearch(a,87));
        System.out.println("这个元素的索引为:"+Arrays.binarySearch(a,86));
    }
}

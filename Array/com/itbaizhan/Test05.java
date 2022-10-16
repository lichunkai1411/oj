package com.itbaizhan;

import java.lang.reflect.Array;
import java.util.Arrays;

// 测试array类
public class Test05 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        System.out.println(a);  // 打印数组地址
//        for (int i:a){
//            System.out.println(i);  //打印数组内容
//
//      }
        System.out.println(Arrays.toString(a));     // 打印数组内容
    }
}

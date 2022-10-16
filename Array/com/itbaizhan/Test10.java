package com.itbaizhan;

import java.util.Arrays;

// 测试Object[][]二维数组存储表格数据
public class Test10 {
    public static void main(String[] args) {
        Object [] a1 = {1001,"高小琪",18,"讲师","2-14"};
        Object [] a2 = {1002,"高小七",20,"助教","10-10"};
        Object [] a3 = {1003,"高小八",30,"主任","5-5"};
        Object [][] excel = new Object[3][];
        excel [0] = a1;
        excel [1] = a2;
        excel [2] = a3;
        System.out.println(Arrays.toString(excel[0]));
        System.out.println(Arrays.toString(excel[1]));
        System.out.println(Arrays.toString(excel[2]));
        System.out.println("=============");
        for (Object[] objects : excel) {
            for (Object object : objects) {
                System.out.println(object + "\t");
            }
            System.out.println();
        }
    }
}

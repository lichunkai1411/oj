package com.itbaizhan;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        // Java中多维数组的声明和初始化应按从低纬到高纬的顺序进行
        int [][] a = new int[3][];
        a [0] = new int[2];
        a [1] = new int[4];
        a [2] = new int[3];
        // int a1 [][] = new int[][4];非法
         a [0][0] = 100;
         a [0][1] = 200;

         int [][] b = {  {1,2,3},
                         {4,5,6},
                         {7,8,9}
                        };
        System.out.println(b[2][2]);

        int [][] c = new int[3][];
        // c [0] = {1,2,5};  错误，未声明类型就初始化
        c [0] = new int[] {2,1};
        c [1] = new int[] {2,2};
        c [2] = new int[] {2,2, 3,4};
        System.out.println(c[2][3]);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));

    }
}

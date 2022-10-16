package com.itbaizhan;

public class Test2 {
    public static void main(String[] args) {
        // 静态初始化
        int[] a = {10, 20, 30, 40, 50};
        Man man[] = {new Man(1, 10),
                new Man(2, 20),
                new Man(3, 30),
                new Man(4, 40)};
        System.out.println(a[1]);
        System.out.println(man[2].getAge());
        // 默认初始化
        int a2[] = new int[2];                  // 默认0,0
        boolean [] booleans = new boolean[2];   // 默认false,false
        String [] strings = new String[2];      // 默认null，null
    }
}

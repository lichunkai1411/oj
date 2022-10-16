package com.itbaizhan;
// 遍历数组
public class Test03 {
    public static void main(String[] args) {
        String [] cities = new String[] { "北京","沈阳","长春","哈尔滨"};
        // 一般遍历
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        // for each遍历数组
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

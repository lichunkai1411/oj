package com.itbaizhan;
// 测试拷贝
public class Test04 {
    public static void main(String[] args) {
        String [] a = {"阿里巴巴","尚学堂","京东","腾讯","搜狐","网易"};
        String [] b = new String[6];
        System.arraycopy(a,0,b,0,a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }
    }
}

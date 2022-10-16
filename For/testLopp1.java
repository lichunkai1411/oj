public class testLopp1 {
    // TODO:九九乘法表
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                // TODO: 三位运算符目的是：将个位数对齐。
                System.out.print(j+"*"+i+"="+(i*j<10?(" "+i*j):i*j)+" ");
            }
            System.out.println();
        }
    }
}

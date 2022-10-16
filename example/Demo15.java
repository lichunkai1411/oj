public class Demo15 {
    // 求和问题 1-100之间奇数之和
    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            num = num + i;
            i = i + 2;
        }
        System.out.println(num);
    }
}

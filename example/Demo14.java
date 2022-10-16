public class Demo14 {
    // 求和问题 1-100所有数之和
    public static void main(String[] args) {
        int num = 0;
        int i=0;
        while (i<=100){
            System.out.println(i);
            num = num+i;
            i++;
        }
        System.out.println(num);
    }
}

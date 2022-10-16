public class Text1055 {
    // 求偶数之和
    public static void main(String[]args){
        int sum=0;
        for (int i = 11; i<100;i++) {
            // 如果对2取余等于0
            if (i%2 == 0) {
                sum +=i;

            }
        }
        System.out.println(sum);
    }
}
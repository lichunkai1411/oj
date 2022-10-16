public class Exe15 {
//    TODO:将此代码改为接收用户输入型
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            int isPrime = 1;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.print(n + " ");
            } else {
            }
        }
    }
}
public class PI {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 1000000; i = i + 2) {
            pi += Math.pow(-1, (i - 1) / 2) / i*4;
        }
        System.out.println(pi);
    }
}

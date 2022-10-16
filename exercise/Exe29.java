public class Exe29 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            // 控制权交由a2控制 （自增）
            a2[i]++;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}

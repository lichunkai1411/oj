public class ReversePrintArray {
    // TODO:倒序遍历数组并打印
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.print(ns[i] + " ");
        }
    }
}

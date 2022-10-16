import java.util.Arrays;
    // TODO:降序排列数组
public class DescendingArray {
    public static void main(String[] args) {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = ns.length - 1; i > 0; i--) {

            for (int j = ns.length - i - 1; j >= 0; j--) {

                if (ns[j] < ns[j + 1]) {

                    int n = ns[j];

                    ns[j] = ns[j + 1];

                    ns[j + 1] = n;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
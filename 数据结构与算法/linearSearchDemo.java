public class linearSearchDemo {
    public static void main(String[] args) {
        // 线性查找
        int[] arr = {1, 3, 5, 7, 9,9,10,10,11,12,13};
        System.out.println(linearSearch(arr, 3));

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) return i;
        }
        return -1;
    }
}

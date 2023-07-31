package 二分查找;

/**
 * 问题1:为什么是 left <= right，意味着区间内有为比较的元素,而不是 left < right?
 * left == right 意味着left,right它们指向的元素也会参与比较
 * left < right 只意味着mid 指向的元素参与比较
 * <p>
 * 问题2:(left + right) / 2 会有什么问题?
 * left + right 可能会导致溢出  应该使用移位运算符避免溢出
 * <p>
 * 问题3:都写成小于号有啥好处?
 * 因为和待查找数组顺序一样
 */
public class binarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 4));

        System.out.println(advancedEdition(arr, 3));
        System.out.println(advancedEdition(arr, 4));

        System.out.println(binarySearchRight2(arr, 4));
        System.out.println(binarySearchLeft2(arr, 4));
    }
    // 二分查找

    /**
     * 两端封闭
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        // 定义左右指针及中间指针
        int left = 0, right = arr.length - 1;
        while (left <= right) { // 注意：这里是 <=
            int mid = (right + left) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else return mid; // 注意：这里是 mid - 1
        }
        return -1;
    }

    /**
     * right只作为边界值，不参与比较
     * 左闭右开
     *
     * @param arr
     * @param target
     * @return
     */
    public static int advancedEdition(int[] arr, int target) {
        // 定义左右指针及中间指针
        int left = 0, right = arr.length;  // 1
        while (left < right) { // 2
            int mid = (right + left) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid; // 3
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else return mid; // 注意：这里是 mid - 1
        }
        return -1;
    }

    public static int advancedReinforcement(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (1 < left - right) {
            int mid = (right + left) >>> 1;
            if (target < arr[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (arr[left] == target) {
            return left;
        } else {
            return -1;
        }
    }

    // 二分查找
    public static int binarySearchDemo(int[] arr, int target) {
        // 定义左右指针及中间指针
        int left = 0, right = arr.length - 1;
        while (left <= right) { // 注意：这里是 <=
            int mid = (right + left) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else return mid; // 注意：这里是 mid - 1
        }
        return -1;
    }

    // 相同目标值最左侧的值
    public static int binarySearchLeft(int[] arr, int target) {
        // 定义左右指针及中间指针
        int left = 0, right = arr.length - 1;
        while (left <= right) { // 注意：这里是 <=
            int mid = (right + left) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else right = mid - 1; // 注意：这里是 mid - 1
        }
        if (arr[left] == target) {
            return left;
        } else {
            return -1;
        }
    }

    // 相同目标值最右侧的值
    public static int binarySearchRight(int[] arr, int target) {
        // 定义左右指针及中间指针
        int left = 0, right = arr.length - 1;
        while (left <= right) { // 注意：这里是 <=
            int mid = (right + left) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else left = mid + 1; // 注意：这里是 mid - 1
        }
        if (arr[right] == target) {
            return right;
        } else {
            return -1;
        }
    }

    /**
     * @param arr    待查找的升序数组
     * @param target 待查找的目标值
     * @return 返回>= target的最左侧的索引
     */
    public static int binarySearchLeft2(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target <= arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * @param arr    待查找的升序数组
     * @param arr    待查找的目标值
     * @param target 返回<= target的最右侧的索引
     * @return
     */
    public static int binarySearchRight2(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) { // 注意：这里是 <=
            int mid = (left + right) >>> 1; // 防止溢出
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1; // 注意：这里是 mid - 1
            }
        }
        return left - 1;
    }
}

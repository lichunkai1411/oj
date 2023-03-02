package Java基础案例.判断两个数组是否相同;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：11:27
 * @author lck
 */
public class Test1 {
    public static void main(String[] args) {

    }
    public static boolean checkArrayContent(int[]arr1,int[]arr2){
        // 1.比较数组的长度
        if (arr1.length != arr2.length){
            return false;
        }
        // 代码要是能够走到这里，代表数组的长度肯定是相同的
        // 数组的长度相同，意味着索引也是相同的

        // 比较数组中的元素内存
        for (int i = 0; i < arr1.length; i++) {
            // arr1[i]:第一个数组中的每一个元素
            // arr2[i]:第二个数组中的每一个元素
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        // 代码要是能够走到这里，数组的长度和内容，顺序是完全相同
        return true;
    }
}

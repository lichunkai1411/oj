package 数组.二维数组;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-27
 * Time：13:06
 * 将提前创建好的一维数组存入到二维数组中
 * @author lck
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] arr1 = {11,22,33};
        int [] arr2 = {44,55,66};

        int [] [] arr = new int[2][3];


        arr[0]=arr1;
        arr[1]=arr2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
     }
}

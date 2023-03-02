package 数组.一维数组;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-26
 * Time：10:29
 * @author lck
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest1();
        userArray();
    }
    public static void arrayTest1(){
        /*完整格式*/
       int []arr1 = new int[]{11,22,33,44,55,66};

       /*简化格式*/
        double[]arr2={11.1,22.2,33.3};
    }
    public static void userArray(){
        int[]arr = {11,22,33,44,55,66};
        // 取出33元素
        System.out.println(arr[2]);

        if (arr[0]%2==0){
            System.out.println(arr[0]+"是一个偶数");
        }else {
            System.out.println(arr[0]+"是一个奇数");
        }
        // 修改数组中第二个元素为66
        arr[2]=66;
        System.out.println(arr[2]);

        // 根据数组中的第四个元素，决定在控制台打印多少次HelloWorld
        for (int i = 0; i < arr[3]; i++) {
            System.out.println("Hello World");
        }
    }
}

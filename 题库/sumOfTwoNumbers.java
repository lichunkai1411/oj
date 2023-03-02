import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-28
 * Time：13:05
 */
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        //两数之和
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = {2, 7, 11, 15};

        boolean count = false;
        wai:
        for (int i = 0; i < nums.length;i++) {
            for (int j = 0; j< nums.length;j++) {
                if (nums[i] + nums[j] == num) {
                    System.out.println(i);
                    System.out.println(j);
                    count = true;
                    break wai;
                }
            }
        }
        if(!count){
            System.out.println("null");
        }


    }
}

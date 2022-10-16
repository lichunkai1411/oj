import java.util.Scanner;

public class Exe32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum = input.nextInt();
        int loc = -1;
        for (int i = 0; i < num.length; i++) {
            if (sum==num[i]){
                loc=i;
                break;
            }
        }
        if (loc>-1){
            System.out.println(sum+"是第"+(loc+1)+"个");
        }else {
            System.out.println(sum+"不在其中");
        }
    }
}

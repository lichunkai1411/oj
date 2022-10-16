package Java入门;

import java.util.Scanner;

public class Text11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // 下落的高度和落地的次数
        float h=input.nextFloat();
        int n =input.nextInt();
        float dis = 0;
        for(int i = 0; i < n; i++){
            dis += h;  //每次加上落下来的距离
            h /= 2; //弹起距离缩短一半
            if(i == n - 1){
                System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", dis));
            }
            dis += h; //弹上去走的距离
        }
    }
}

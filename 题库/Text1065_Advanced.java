import java.util.*;
public class Text1065_Advanced {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // 标准输入
        int m = input.nextInt();
        int n = input.nextInt();
        // 输出结果
        System.out.println(getCM(m,n));
    }
    public static int getCM(int m,int n) {
        // 大者
        int big=(Math.max(m, n));
        // 小者
        int small=(Math.min(m,n));
        int count=0;
        for(int i=small;i<=big*small;i++)
        {
            if(i%small==0&&i%big==0)
            {
                count=i;
                break;
            }
        }
        return count;
    }
}

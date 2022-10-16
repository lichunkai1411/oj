import java.util.Scanner;

public class Text1065{
    // 最小公倍数
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 接收两个自然数保存到a b中
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = min(a, b);
        int n = a*b/m;
        System.out.print(n);
    }
    public static int min(int a, int b){
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        while(b != 0){
            if(a == b){
                return a;
            }else{
                int k = a % b;
                a = b;
                b = k;
            }
        }
        return a;
    }
}
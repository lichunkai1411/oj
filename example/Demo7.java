import java.util.Random;
import java.util.Scanner;

public class Demo7 {
    // 获取随机数
    public static void main(String[] args) {
        // double ra = Math.random();
        // System.out.println((int)(ra*100 ));
        // Random re = new Random();
        // int a=re.nextInt(10);
        // System.out.println(a);
        // 获取1000-1100的随机数
        Random c =new Random();
        int b = c.nextInt(100);
        System.out.println(1000+b);
    }
}

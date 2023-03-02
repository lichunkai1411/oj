package Java基础案例.逢七跳过;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：10:41
 * @author lck
 */
public class Test1 {
    public static void main(String[] args) {
        knockSeven();
    }
    public static void knockSeven(){
        for (int i = 1; i <= 100; i++) {
            int ge = i%10;
            int shi = i/10%10;

            if (ge == 7 || shi==7||i%7==0) {
                System.out.println(i);
            }
                /*System.out.println("过");
            }else {
                System.out.println(i);
            }*/
        }
    }
}

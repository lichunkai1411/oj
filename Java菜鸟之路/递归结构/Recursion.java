package 递归结构;

/**
 * @Author Lick
 * @date Created in 2022-10-25 13:56
 */
public class Recursion {
    public static void main(String[] args) {
        a();
    }
    static int count = 0;
    static void a() {
        System.out.println("彤");
        count++;
        if (count<10){
            a();
        }else {
            return;
        }
    }
}

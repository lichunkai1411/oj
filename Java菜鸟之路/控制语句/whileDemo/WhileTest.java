package 控制语句.whileDemo;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-26
 * Time：09:21
 * @author lck
 */
public class WhileTest {
    public static void main(String[] args) {
        printDaffodil();
    }
    public static void printDaffodil(){
        int i = 100;
        while (i<=999){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println(i);
            }
            i++;
        }
    }
}

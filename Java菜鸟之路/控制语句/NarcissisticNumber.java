package 控制语句;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-25
 * Time：11:30
 * @author lck
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        daffodilNumber();
    }
    public static void daffodilNumber(){
        for (int i = 100; i <= 999; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println(i);
            }
        }
    }
}

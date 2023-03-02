package 控制语句.whileDemo;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-26
 * Time：09:14
 * @author lck
 */
public class WhileDemo {
    public static void main(String[] args) {
        forTest();
        whileTest();
    }
    public static void forTest(){
        for (int i = 0; i < 5; i++) {
            System.out.println("haohao");
        }
        System.out.println("------------------------------------------");
    }
    public static void whileTest(){
        int i = 0;
        while (i<5){
            System.out.println("haohao");
            i++;
        }
    }
}

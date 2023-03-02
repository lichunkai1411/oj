package 控制语句.dowhileDemo;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-26
 * Time：09:27
 * @author lck
 */
public class DoWhileDemo {
    public static void main(String[] args) {
            forDemo();
            doWhileDemo();
    }
    public static void forDemo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("haohao");
        }
        System.out.println("--------------------------------------------");
    }
    public static void doWhileDemo(){
        int i = 0;
        do {
            System.out.println("haohao");
            i++;
        }while (i<5);
    }
}

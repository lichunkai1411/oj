package 继承.综合案例;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：17:29
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
     Coder coder = new Coder("张三",23,15000);
     coder.work();

     Manager manager = new Manager("李四",24,18000,5000);
     manager.work();
    }
}

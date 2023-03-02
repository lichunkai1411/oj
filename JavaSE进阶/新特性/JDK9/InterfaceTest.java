package 新特性.JDK9;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：11:11
 * @author lck
 */

/**
 *          JDK9接口特性：
 *                  接口中允许定义私有方法
 */
public class InterfaceTest {
    public static void main(String[] args) {

    }
}
interface Inter{
    void show();
    void print();
    public default void start(){
        System.out.println("start方法执行...");
        log();
    }
    public default void end() {
        System.out.println("end方法执行...");
        log();
    }
    // 格式问题私有方法不能有default关键字
    private void log(){
        System.out.println("日志记录");
    }
}

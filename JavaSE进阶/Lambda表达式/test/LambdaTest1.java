package Lambda表达式.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:53
 *
 * @author lck
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，重写后的show方法...");
            }
        });
        System.out.println("--------------------------------------------------------");
        useShowHandler(()->System.out.println("我是匿名内部类，重写后的show方法..."));
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

interface ShowHandler {
    void show();
}
package Lambda表达式.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:53
 *
 * @author lck
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String message) {
                System.out.println("匿名内部类打印：" + message);
                System.out.println("--------------------------------");
            }
        });
        useStringHandler(message -> System.out.println("Lambda打印：" + message));
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("hello world");
    }
}

interface StringHandler {
    void printMessage(String message);
}
package Lambda表达式;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:31
 *
 * @author lck
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        useInterB(new InterB() {
            @Override
            public void show1() {
                System.out.println("匿名内部类...show1...");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类...show2...");
            }
        });
        System.out.println("--------------------------------");
//        useInterB(() -> {});
    }
    public static void useInterB(InterB interB) {
        interB.show1();
        interB.show2();
    }
}
//@FunctionalInterface
interface InterB {
    void show1();

    void show2();
}

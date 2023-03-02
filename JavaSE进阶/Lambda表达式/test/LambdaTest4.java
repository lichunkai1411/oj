package Lambda表达式.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:53
 *
 * @author lck
 */
public class LambdaTest4 {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        });
        useCalculator((x, y) -> x - y);
    }

    public static void useCalculator(Calculator calculator) {
        System.out.println(calculator.calc(10, 20));
    }
}

interface Calculator {
    int calc(int x, int y);
}

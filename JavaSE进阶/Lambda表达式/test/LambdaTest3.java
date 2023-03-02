package Lambda表达式.test;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:53
 *
 * @author lck
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        useRandomNumberHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });
        useRandomNumberHandler(() ->  new Random().nextInt(100) + 1);
    }

    public static void useRandomNumberHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler {
    int getNumber();
}
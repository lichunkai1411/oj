package 时间API.JDK8之后.Instant;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author：Lick
 * @Date Created in 2023-07-19
 * @Time：16:49
 * @Version: V1.0.0
 * @Description: TODO
 */
public class InstantDemo3 {
    public static void main(String[] args) {
        Instant now = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("now:"+now);
    }
}

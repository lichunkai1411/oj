package 时间API.JDK8之后.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：17:46
 */
public class InstantDemo1 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("当前的时间戳是:"+now);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}

package 自增自减运算符;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-23
 * Time：16:22
 *
 * @author lck
 */
public class OperatorTest {
    public static void main(String[] args) {
        int x = 10;
        // y = 10, x = 11;
        int y = x++;
        // y = 11, z= 11;
        int z = ++y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        System.out.println("----------------------------------");


        int a = 3;

        int b = (++a)+(a++)+(a*10);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

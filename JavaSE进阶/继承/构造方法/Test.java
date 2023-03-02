package 继承.构造方法;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：13:45
 *
 * @author lck
 */

/**
 *      除了Object类，在所有的构造方法中，都默认隐藏了一句话 super();
 *      通过这句代码，来访问父类的空参构造方法
 *
 *      细节：java当中所有的类，都直接或间接的继承到了Object类
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi(10);
    }
}

class Fu {
    public Fu() {
        System.out.println("Fu类的空参构造方法");
    }

    public Fu(int num) {
        System.out.println("Fu类的带参构造方法");
    }
}

class Zi extends Fu {
    public Zi() {
        System.out.println("Zi类的空参构造方法");
    }

    public Zi(int num) {
        System.out.println("Zi类的带参构造方法");
    }
}

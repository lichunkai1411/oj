package 继承;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：09:16
 *
 * @author lck
 */

/**
 *  方法重载(overload)：在同一个类中，方法名相同、参数不同、与返回值无关
 *                      参数不同：类型不同、个数不同、顺序不同
 *
 *  方法重写(override)：在子父类当中，出现了方法声明一模一样的方法(方法名、参数、返回值)
 *
 *                      目标1：能够独立识别出，方法是不是重写的方法
 *                                  - 注解：@Override
 *
 *                      目标2：方法重写的使用场景
 *                                  - 当子类需要父类的方法，但是觉得父类的方法逻辑不好(修改 | 增强)就可以对父类的方法进行重写
 * @author lck
 */
public class ExtendsDemo3 {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}

class Father{
    public void method(){
        System.out.println("Father...method..");
    }
}
class Son extends Father{
    public void method(){
        System.out.println("Son...method");
    }
}
class Left{
    public void love(){
        System.out.println("送花");
        System.out.println("送肉");
        System.out.println("唱歌");
    }
}
class Right extends Left{
    @Override
    public void love() {
//        super.love();
        System.out.println("送包");
        System.out.println("送口红");
        System.out.println("我喜欢你，一起爬山吗~");
    }
}
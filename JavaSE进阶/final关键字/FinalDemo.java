package final关键字;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：18:26
 * @author lck
 */

/**
 *      final:可以修饰(方法、类、变量)
 *
 *      特点：
 *          修饰方法：表明该方法是最终方法，不能被重写
 *          修饰类：表明该类是最终类，不能被继承
 *          修饰变量：表明该变量是常量，不能再次被赋值
 *                  final修饰变量的命名规范：
 *                                  如果变量名是一个单词，所有字母大写  max MAX
 *                                  如果变量名是多个单词，所有字母大写，中间使用下划线分隔  maxValue MAX_VALUE
 *          --------------------------------------------
 *          基本数据类型：数据值不可改变
 *          引用数据类型：地址值不可改变，但是内容可以改变
 *          --------------------------------------------
 *          final修饰成员变量的注意事项：
 *                  1.final修饰成员变量，不允许修饰默认值
 *                  2.final修饰成员变量的初始化时机
 *                          1).在定义的时候直接赋值
 *                          2).在构造方法中完成赋值
 * @author lck
 */
public class FinalDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
class Fu{
    public final void method(){
        System.out.println("父类中非常重要的方法，不希望子类进行修改");
    }
    public final void show(){

    }
    public final void print(){

    }
}
/*final class Fu{
    public final void method(){
        System.out.println("父类中非常重要的方法，不希望子类进行修改");
    }
    public final void show(){

    }
    public final void print(){

    }
}*/
class Zi extends Fu{
    // 被final修饰的方法不能被子类重写
    /*@Override
    public void method() {
        System.out.println("哈哈哈哈哈哈，功能被我干掉了");
    }*/
}

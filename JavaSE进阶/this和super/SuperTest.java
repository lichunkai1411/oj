package this和super;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：17:36
 * @author lck
 */

/**
 *      super调用父类成员的省略规则：
 *                      super.父类成员变量 | super.父类成员方法()
 *
 *                      -> 别调用的变量和方法，在子类中不存在，super.可以直接省略(本质省略的是this)
 */
public class SuperTest {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
class Fu{
    int num = 10;
    public void show(){
        System.out.println("Fu...show");
    }
}
class Zi extends Fu{
    public void method(){
        System.out.println(super.num);
        super.show();
    }
}
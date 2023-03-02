package this和super;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：17:48
 * @author lck
 */

/**
 *      开闭原则：对功能扩展做开放，对修改代码做关闭
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A(1, 2, 3);
        A a2 = new A(4, 5, 6);
        A a3 = new A(1,2,3,4);
    }
}

/**
 *      应用场景：项目Version1.0版本：有3个成员变量
 *               项目Version1.1版本：新增一个成员变量
 */
class A{
    int a;
    int b;
    int c;
    int d;

    public A() {
    }

    public A(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public A(int a,int b,int c,int d){
        this(a,b,c);
        this.d=d;
    }
}
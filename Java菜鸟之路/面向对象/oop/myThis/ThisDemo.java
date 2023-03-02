package 面向对象.oop.myThis;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：11:14
 * @author lck
 */
public class ThisDemo {
    String name ;
    public void sayHello(String name){
        System.out.println(name);
        System.out.println(this.name);
        this.method();
    }
    public void method(){
        System.out.println("method...");
    }
}

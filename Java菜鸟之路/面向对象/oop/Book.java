package 面向对象.oop;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：10:20
 * @author lck
 */
public class Book {
    String id;
    String name;
    double price;

    public void show(){
        System.out.println("编号为："+id+"，书名为："+name+"，价格为："+price);
    }
}

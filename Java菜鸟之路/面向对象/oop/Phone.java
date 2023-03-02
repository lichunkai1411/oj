package 面向对象.oop;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：10:08
 * @author lck
 */
public class Phone {
    String brand;
    String color;
    Integer price;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}

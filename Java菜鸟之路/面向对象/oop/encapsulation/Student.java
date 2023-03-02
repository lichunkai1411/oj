package 面向对象.oop.encapsulation;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：13:24
 * @author lck
 */
public class Student {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age>=1&&age<=120){
            this.age = age;
        }else {
            System.out.println("滚！");
        }

    }
}

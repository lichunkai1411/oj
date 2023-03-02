package 面向对象.oop.constructor;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：12:11
 * @author lck
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张三",21);
        System.out.println(student.name+"--"+student.age);
    }
}

package 面向对象.oop;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：09:57
 * @author lck
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);

        student.eat();
        student.study();
    }
}

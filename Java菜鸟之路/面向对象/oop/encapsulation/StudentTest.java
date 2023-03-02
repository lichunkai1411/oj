package 面向对象.oop.encapsulation;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：13:24
 * @author lck
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(23);

        int age = student.getAge();
        System.out.println(age);
    }
}

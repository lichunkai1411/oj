package 包;

import 包.a.Student;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：08:43
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();

        // 使用全类名创建对象：包名 + 类名
        包.b.Student student1 = new 包.b.Student();
        student1.sleep();
    }
}

package static关键字;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：17:11
 * @author lck
 */

/**
 *
 * @author lck
 */
public class StaticDemo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "张三";
        student1.age=23;
        Student.school="传智专修学院";

        System.out.println(student1.name+"---"+student1.age+"---"+Student.school);

        System.out.println("---------------------------------");

        Student student2 = new Student();
        student2.name = "李四";
        student2.age=22;
        /*student2.school="传智专修学院";*/

        System.out.println(student2.name+"---"+student2.age+"---"+Student.school);

        Student student3 = new Student();
        System.out.println(student3.name+"---"+student3.age+"---"+Student.school);
    }
}

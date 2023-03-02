package 继承.Test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：13:54
 * @author lck
 */

/**
 *      需求：
 *              人类(person)
 *                      成员变量：姓名，年龄
 *              老师类：
 *                      成员变量：姓名，年龄
 *                      成员方法：teach
 *                              - 姓名为张三，年龄为30岁的老师正在讲课
 *              学生类：
 *                      成员变量：姓名，年龄，成绩
 *                      成员方法：study
 *                               - 姓名为李四，年龄为20岁，成绩为100分的学生，正在学习
 * @author lck
 */
public class Test1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三",30);
        teacher.teach();

        Student student = new Student("李四",20,100);
        student.study();
    }
}

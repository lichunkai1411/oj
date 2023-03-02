package 面向对象.oop.list.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-04
 * Time：13:12
 * @author lck
 */

import 面向对象.oop.list.domain.Student;

import java.util.ArrayList;

/**
 *      需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 *                                                        (在控制台，展示出年龄低于18岁的学生信息
 * @author lck
 */
public class ArrayListTest2 {
    public static void main(String[] args) {

    }

    private static void method2() {
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",14);
        Student stu3 = new Student("王五",15);
        ArrayList<Student>list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);

            if (student.getAge()<18) {
                System.out.println(student.getName()+"---"+student.getAge());
            }
        }
    }

    private static void method1() {
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",14);
        Student stu3 = new Student("王五",15);
        ArrayList<Student>list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}

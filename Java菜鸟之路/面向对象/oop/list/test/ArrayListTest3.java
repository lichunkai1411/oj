package 面向对象.oop.list.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-04
 * Time：18:09
 * @author lck
 */

import 面向对象.oop.list.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该数组
 *              学生姓名和年龄来自键盘录入
 * @author lck
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        // 1.准备集合容器，用于存储学生对象
        ArrayList<Student>list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生信息：");
            addStudent(list);
        }
        // 遍历集合，打印学生信息
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        // 2.键盘录入学生信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        // 3.将键盘例如的学生信息，封装为学生对象
        Student student = new Student(name,age);
        // 4.将封装好的学生对象，存入集合
        list.add(student);
    }
}

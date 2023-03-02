package 面向对象.oop.list.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：09:20
 * @author lck
 */

import 面向对象.oop.doMain.Student;

import java.util.ArrayList;

/**
 *      需求：定义一个方法，方法接收一个集合对象(泛型为Student)
 *              方法内部将年龄低于18的学生对象找出
 *              并存入新集合对象，方法返回新集合
 * @author lck
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三",23));
        list.add(new Student("李四",14));
        list.add(new Student("王五",15));

        ArrayList<Student>newList=filter(list);
        for (int i = 0; i < newList.size(); i++) {
            Student student = newList.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }

    private static ArrayList<Student> filter(ArrayList<Student> list) {
        // 1.创建新的集合容器，准备存储筛选后的学生对象
        ArrayList<Student> newList = new ArrayList<>();
        // 2.遍历原集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            // 3.筛选
            if (student.getAge()<18){
                // 4.将满足条件的学生对象，存入新集合
                newList.add(student);
            }
        }
        return newList;
    }
}

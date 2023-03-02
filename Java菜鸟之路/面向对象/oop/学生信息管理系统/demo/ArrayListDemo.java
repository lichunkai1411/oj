package 面向对象.oop.学生信息管理系统.demo;

import 面向对象.oop.学生信息管理系统.doMain.Student;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：10:23
 *
 * @author lck
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Student student1 = new Student("heima001", "张三", 23, "1999-11-11");
        Student student2 = new Student("heima002", "李四", 24, "1999-11-12");
        Student student3 = new Student("heima003", "王五", 25, "1999-12-11");

        ArrayList<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);

        String id = "heima001";
        int index = getIndex(id, list);
        System.out.println(index);
    }

    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            // 从集合中取出的学生ID
            // ID要查找的学号
            // 比对
            if (student.getId().equals(id)) {
                // 找到了，返回正确的索引位置
                return i;
            }
        }
        // 没找到返回-1
        return -1;
    }
}


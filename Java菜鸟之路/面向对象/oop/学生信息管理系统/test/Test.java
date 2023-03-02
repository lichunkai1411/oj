package 面向对象.oop.学生信息管理系统.test;

import 面向对象.oop.学生信息管理系统.doMain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：09:52
 *
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
        // 测试数据
        /*Student student1 = new Student("heima001", "张三", 23, "1999-11-11");
        Student student2 = new Student("heima002", "李四", 24, "1999-11-12");
        Student student3 = new Student("heima003", "王五", 25, "1999-12-11");*/
        // 5.增删改查都是围绕这个集合进行操作的
        ArrayList<Student> list = new ArrayList<>();
        /*list.add(student1);
        list.add(student2);
        list.add(student3);*/
        // 1.键盘录入
        Scanner scanner = new Scanner(System.in);
        // 2.菜单编写
        while (true) {
            System.out.println("--------欢迎来到学生信息管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学会");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");

            int choice = scanner.nextInt();

            // 3.固定值匹配使用switch循环
            switch (choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudentById(list);
                    break;
                case 3:
                    updateStudentInfoById(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    // 4.终止正在运行的JVM虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请检查！");
                    break;
            }
        }

    }

    /**
     * 此方法用于录入学生信息，封装学生对象，存入集合
     *
     * @param list
     */
    private static void addStudent(ArrayList<Student> list) {
        // 1.键盘录入要添加的学生学号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String id = "";
        while (true) {
            id = scanner.next();
            // 验证学号是否唯一
            int index = getIndex(id, list);
            if (index == -1) {
                // 学号在集合中不存在，可以使用！
                break;
            } else {
                System.out.println("您输入的学号已被占用，请重新输入！");
            }
        }
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = scanner.next();

        Student student = new Student(id, name, age, birthday);
        list.add(student);
        System.out.println("添加成功！");
    }

    /**
     * 此方法根据学号修改集合中的学生信息
     *
     * @param list
     */
    private static void updateStudentInfoById(ArrayList<Student> list) {
        // 1.键盘录入要修改的学生学号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String updateId = scanner.next();
        // 2.调用getIndex方法查找学号对应的索引
        int index = getIndex(updateId, list);
        // 3.如果学号不存在，给出错误提示
        if (index == -1) {
            System.out.println("查无此人，修改失败！");
        } else {
            // 4.如果学号存在，录入新的学生信息，完成修改
            System.out.println("请输入新的学生姓名：");
            String name = scanner.next();
            System.out.println("请输入新的学生年龄");
            int age = scanner.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = scanner.next();

            // 将新录入的学生信息，封装为学生对象
            Student student = new Student(updateId, name, age, birthday);
            list.set(index, student);
            System.out.println("修改成功！");
        }


    }

    /**
     * 此方法根据学号删除学生
     *
     * @param list
     */
    private static void deleteStudentById(ArrayList<Student> list) {
        // 1.根据键盘录入要删除的学生学号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要删除的学生学号：");
        String id = scanner.next();
        // 2.调用getIndex方法，查找学号在集合中的索引
        int index = getIndex(id, list);
        // 3.判断方法的返回值是否是 -1
        if (index == -1) {
            // 3.1 是-1，说明学号不存在，给出错误提示
            System.out.println("查无此人，删除失败！");
        } else {
            // 3.2 不是-1，根据索引做删除
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    /**
     * 此方法用于查看学生
     *
     * @param list
     */
    private static void queryStudentInfos(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("查无信息，请添加后重试！");
        } else {
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBirthday());
            }
        }
    }

    /**
     * 此方法根据学号，去集合中查找对应的索引
     */
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

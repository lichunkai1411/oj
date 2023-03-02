/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-22
 * Time：21:34
 */
/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-22
 * Time：21:30
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String gender;
    String major;
    String id;

    public Student(String name, int age, String gender, String major, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public class StudentInformationManagementSystem {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentInformationManagementSystem system = new StudentInformationManagementSystem();
        system.run();
    }

    public void run() {
        while (true) {
            System.out.println("请选择您要进行的操作：");
            System.out.println("1. 添加学生信息");
            System.out.println("2. 查找学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 删除学生信息");
            System.out.println("5. 退出系统");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效的选项，请重新选择！");
            }
        }
    }

    private void addStudent() {
        System.out.println("请输入学生姓名：");
        String name = scanner.next();

        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入学生性别：");
        String gender = scanner.next();

        System.out.println("请输入学生专业：");
        String major = scanner.next();

        System.out.println("请输入学生学号：");
        String id = scanner.next();

        Student student = new Student(name, age, gender, major, id);
        students.add(student);
        System.out.println("添加学生信息成功！");
    }

    private void findStudent() {
        System.out.println("请输入要查找的学生学号：");
        String id = scanner.next();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("学生姓名：" + student.getName());
                System.out.println("学生年龄：" + student.getAge());
                System.out.println("学生性别：" + student.getGender());
                System.out.println("学生专业：" + student.getMajor());
                System.out.println("学生学号：" + student.getId());
                return;
            }
        }

        System.out.println("没有找到该学生信息！");
    }

    private void updateStudent() {
        System.out.println("请输入要修改的学生学号：");
        String id = scanner.next();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("请选择要修改的属性：");
                System.out.println("1. 学生姓名");
                System.out.println("2. 学生年龄");
                System.out.println("3. 学生性别");
                System.out.println("4. 学生专业");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("请输入学生姓名：");
                        String name = scanner.next();
                        student.setName(name);
                        break;
                    case 2:
                        System.out.println("请输入学生年龄：");
                        int age = scanner.nextInt();
                        student.setAge(age);
                        break;
                    case 3:
                        System.out.println("请输入学生性别：");
                        String gender = scanner.next();
                        student.setGender(gender);
                        break;
                    case 4:
                        System.out.println("请输入学生专业：");
                        String major = scanner.next();
                        student.setMajor(major);
                        break;
                    default:
                        System.out.println("无效的选项，请重新选择！");
                }

                System.out.println("修改学生信息成功！");
                return;
            }
        }

        System.out.println("没有找到该学生信息！");
    }

    private void deleteStudent() {
        System.out.println("请输入要删除的学生学号：");
        String id = scanner.next();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("删除学生信息成功！");
                return;
            }
        }

        System.out.println("没有找到该学生信息！");
    }
}


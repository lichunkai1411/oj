package 继承;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：08:46
 *
 * @author lck
 */
public class ExtendsDemo1 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("张三");
        coder.setAge(23);
        coder.setSalary(12000);
        System.out.println(coder.getName() + "---" + coder.getAge() + "---" + coder.getSalary());
    }
}

/**
 * 创建类的细节：
 * 一个.java文件中可以编写多个class
 * 1.保证类与类之间是平级关系
 * 2.只能有一个被public修饰
 */
class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Coder extends Employee {

}

class Manager extends Employee {

}

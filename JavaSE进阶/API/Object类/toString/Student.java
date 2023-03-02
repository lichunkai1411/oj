package API.Object类.toString;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：15:34
 */
public class Student {
    private String name;
    private int age;
/*
    @Override
    public boolean equals(Object obj) {
        // 首先判断要比较的对象是不是Student类型
        if (obj instanceof Student) {
            // 向下转型的目的，是为了调用子类特有的成员
            Student student = (Student) obj;
            return this.age == student.age && this.name.equals(student.name);
        } else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        // this : stu1
        // o : stu2
        // 两个对象做地址值的比较，如果地址相同，里面的内容肯定相同，直接返回为true
        if (this == o) return true;
        // 代码走到这里 地址肯定不一样 stu1肯定不是null stu1不是null，stu2是null，直接返回false
        // getClass() != o.getClass() ： 两个对象的字节码是否相同
        // 如果字节码不相同，就意味着类型不相同，直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 代码走到这里 说明类型相同
        // 向下转型
        Student student = (Student) o;
        // 对象里面的属性进行比较
        return age == student.age && Objects.equals(name, student.name);
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}

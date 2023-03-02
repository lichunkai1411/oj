package 面向对象.oop.学生信息管理系统.doMain;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：10:03
 *
 * @author lck
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * 获取
     *
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     *
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

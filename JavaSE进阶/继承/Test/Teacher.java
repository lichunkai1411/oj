package 继承.Test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：13:59
 * @author lck
 */
public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teach(){
        System.out.println("姓名为"+super.getName()+"，年龄为"+super.getAge()+"岁的老师正在讲课");
    }
}

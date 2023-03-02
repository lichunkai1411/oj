package 继承.综合案例;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：17:12
 * @author lck
 */
public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为："+getName()+"，年龄为："+getAge()+"，工资为："+getSalary()+"的程序员正在编写代码");
    }
}

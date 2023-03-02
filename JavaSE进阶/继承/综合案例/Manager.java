package 继承.综合案例;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：17:15
 * @author lck
 */
public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(){

        }
        public Manager(String name,int age,double salary,double bonus){
        super(name,age,salary);
        this.bonus=bonus;
        }

    @Override
    public void work() {
        System.out.println("姓名为："+getName()+"，年龄为："+getAge()+"，工资为："+getSalary()+"，奖金为："+bonus+"的项目经理正在分配任务");
    }
}

package Java面向对象编程.封装.细节;

/**
 * @Author Lick
 * @date Created in 2022-11-06 17:09
 */
public class TestPackaging {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        if (age>=1&&age<=130){
            this.age = age;
        }else {
            System.out.println("请输入正常的年龄！");
        }
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "TestPackaging{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", man=" + man +
                '}';
    }
}

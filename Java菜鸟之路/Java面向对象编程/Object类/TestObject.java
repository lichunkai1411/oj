package Java面向对象编程.Object类;

/**
 * 测试Object类
 * 测试equals
 */
public class TestObject extends Object{
    int id;
    String name;
    String pwd;

    public TestObject(int id, String name, String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "账户名："+name+"姓名："+name+"密码："+pwd;
    }

    public static void main(String[] args) {
        TestObject obj = new TestObject(1001,"zs","123456");
        TestObject obj2 = new TestObject(1002,"ls","234567");
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        System.out.println(obj.equals(obj2));
    }
}

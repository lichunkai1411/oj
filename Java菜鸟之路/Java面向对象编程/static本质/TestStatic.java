package Java面向对象编程.static本质;

/**
 * 测试static
 */
public class TestStatic {
    int id; // id
    String name; // name
    String pwd; // password
    static String company = "淘宝";   // 公司名称
    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println("登录"+name);
    }

    public static void printCompany() {
        // login(); // 调用非静态成员，编译就会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic(101, "lick");
        testStatic.printCompany();
        TestStatic.company = "京东";
        TestStatic.printCompany();
    }
}

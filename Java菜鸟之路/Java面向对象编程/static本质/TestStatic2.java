package Java面向对象编程.static本质;

public class TestStatic2 {
    static String company;  // 公司名称

    static {
        System.out.println("执行类的初始化工作");
        company = "京东";
        printCompany();
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {

    }
}

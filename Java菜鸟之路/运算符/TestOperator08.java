package 运算符;

// TODO:优先级问题
public class TestOperator08 {
    public static void main(String[] args) {
        boolean s1 = true, s2 = true, s3 = false;
        // 逻辑运算符：非>与>或
        System.out.println(s1 || s2 && s3);
        // 建议使用小括号组织表达式
        boolean s4 = (3>1||4>3)&&3<5;
        System.out.println(s4);
    }
}

package 浮点型;

/**
 * 测试浮点数基本用法
 */
public class TestFloatNumber {
    public static void main(String[] args) {
        double a = 3.14;
        double b = 3.14E2;  //科学计数法
        System.out.println(a);
        System.out.println(b);
        float f = 1.65F;  //浮点常量的默认类型是double，改float需在后面加F
        System.out.println(f);

        // 浮点数不精确不要进行比较
        float f1 = 0.1f;
        double f2 = 1.0 / 10;
        System.out.println(f1 == f2);  // 一个=是赋值，两个==是等于
        float f4 = 234324332432L;
        float f5 = f4 + 1;
        System.out.println(f4 == f5);
    }
}

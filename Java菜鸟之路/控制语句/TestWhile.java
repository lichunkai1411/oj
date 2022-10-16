package 控制语句;

/**
 * 测试while语句
 */
public class TestWhile {
    public static void main(String[] args) {
        System.out.println("I love You");
        System.out.println("I love You");
        System.out.println("I love You");

        int a = 0;  // 初始化部分
        while (a < 3) {  // 布尔表达式
            System.out.println("I love You---" + a);  // 循环体
            a++;  // 迭代因子
        }

        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("1累加到100的和：" + sum);
    }
}

package 控制语句;

/**
 * 测试for循环
 */
public class TestFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("I love You---" + i);
        }
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1累加到100的和：" + sum);

        for (int i = 9; i > 0; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
        // 90-1之间被三整除的数
        for (int i = 90; i > 0; i -= 3) {   // 每隔三位就可以被3整除
            System.out.print(i + "\t");
        }
    }
}

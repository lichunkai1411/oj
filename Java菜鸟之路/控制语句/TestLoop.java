package 控制语句;

/**
 * 测试嵌套循环
 */
public class TestLoop {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }
}

package 控制语句;

/**
 * 测试"带标签的continue"
 * 控制嵌套循环跳转（打印101～150之间所有的质数）
 */
public class TestContinue2 {
    public static void main(String[] args) {
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if (i%j == 0) {
                    // 符合条件，跳到外部循环继续
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}

package 控制语句;

/**
 * 测试if单分支结构
 * 掷骰子游戏:
 * 1.如果三次的值加起来大于15，则手气不错。
 * 2.如果三次值的和在10-15之间，手气一般
 * 3.如果三次值的和在10以下手气不怎么样。
 */
public class TestIf01 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 6) + 1;
        int j = (int) (Math.random() * 6) + 1;
        int k = (int) (Math.random() * 6) + 1;
        int count = i + k + j;
        System.out.println("第一次掷骰子：" + i);
        System.out.println("第二次掷骰子：" + j);
        System.out.println("第三次掷骰子：" + k);
        System.out.println("今天得分：" + count);
        if (count > 15) {
            System.out.println("手气不错！");
        }
        if (count >= 10 && count < 15) {
            System.out.println("手气一般！");
        }
        if (count < 10) {
            System.out.println("手气不怎么样！");
        }
    }
}


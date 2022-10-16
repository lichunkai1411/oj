package 控制语句;

/**
 * 测试break语句
 * 产生100以内的随机数，直到随机数为88时终止循环
 */
public class TestBreak {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            int i = (int) (Math.random()*100);
            System.out.println(i);
            if (i == 88) {
                break;
            }
        }
        System.out.println("循环次数为："+count);
    }
}

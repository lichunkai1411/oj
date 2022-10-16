package 控制语句;

/**
 * 测试Continue语句
 * 把100～150之间不能被3整除的数输出，并且每行输出5个
 */
public class TestContinue {
    public static void main(String[] args) {
        int count = 0;  // 计数器
        for (int i = 100; i < 150; i++) {
            if (i%3==0){
                continue;   // 能被3整除跳出本次循环
            }
            System.out.print(i+"");
            count++;
            if (count==5){
                System.out.println();
                count = 0;  //计数器归零
            }
        }
    }
}

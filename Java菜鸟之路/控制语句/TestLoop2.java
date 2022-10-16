package 控制语句;

/**
 * 使用嵌套循环实现九九乘法表
 */
public class TestLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j<10?(" "+i*j):i*j)+" ");   // 实现个位数对其
            }
            System.out.println();
        }
    }
}

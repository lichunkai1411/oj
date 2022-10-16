public class Demo29 {
    // break和continue用法
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次循环开始执行！");
            System.out.println("----第" + i + "次循环代码1");
            System.out.println("----第" + i + "次循环代码2");
            if (i == 5) {
                System.out.println("循环即将结束！");
                break;
            }
            if (i == 3) {
                System.out.println("本次循环结束！继续下一次循环！");
                continue;
            }
            System.out.println("----第" + i + "次循环代码3");
            System.out.println("----第" + i + "次循环代码4");
        }
        System.out.println("程序结束！");
    }
}

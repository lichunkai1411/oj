public class Text41_1 {
    // 纸折叠多少次？
    public static void main(String[] args) {
        // 声明变量折叠次数
        int fold = 0;
        // 声明喜马拉雅山高度
        double high = 8848.48;
        // 定义双精度浮点数
        double i = 0.01;
        // 进入for循环
        for (; i < high; ) {
            fold++;
            // 折叠后续乘2
            i = i * 2;
        }
        // 输出打印折叠次数
        System.out.println(fold);
        // 输出打印厚度四舍五入再返回给定参数最大的整数
        System.out.println(Math.round(Math.floor(i)));
        // System.out.println(i);
    }
}
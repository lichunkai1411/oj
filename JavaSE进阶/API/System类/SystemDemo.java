package API.System类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：23:37
 */
public class SystemDemo {
    /**
     * System类常见的方法：
     * 1.public static void exit (int status) : 终止当前运行的Java虚拟机，非零表示异常终止
     * 2.public static long currentTimeMillis () : 返回当前系统的时间毫秒值形式
     * - 返回1970年1月1日 0时0分0秒，到现在所经历的毫秒值(原因：1969年8月，贝尔实验室的程序员肯汤普逊利用妻儿离开一个月的机会。开始着手创造一个全新的革命性的操作系统，他使用B编译语言在老久的PDP-7机器上开发出了Unix的一个版本。随后，汤普逊和同时丹尼斯里奇改进了B语言，开发出了C语言，重写了Unix)1970年1月1日 算是C语言的生日
     * - 常用于测试某段代码的运行时间
     * 3.public static void arraycopy (Object src, int srcPos, Object dest, int destPos, ine length) : 数组拷贝
     * 1.数据源数组
     * 2.起始索引
     * 3.目的地数据
     * 4.起始索引
     * 5.拷贝个数
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] destArr = new int[3];
        System.arraycopy(arr,2,destArr,0,3);
        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }
    }

    private static void method() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 100000; i++) {
            s += i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

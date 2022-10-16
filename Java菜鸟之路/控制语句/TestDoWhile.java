package 控制语句;

/**
 * 测试do-while
 */
public class TestDoWhile {
    public static void main(String[] args) {
        // while循环：先判断再执行
        int a= 0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("-------");

        // do-while循环：先执行再判断
        a=0;
        do {
            System.out.println(a);
            a++;
        }while (a<3);
    }
}

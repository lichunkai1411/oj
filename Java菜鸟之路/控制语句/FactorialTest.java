package 控制语句;

public class FactorialTest {
    public static void main(String[] args) {
        long d3 = System.currentTimeMillis();
        int a = 10;
        int result =1;
        while (a>1){
            result*=a*(a-1);
            a-=2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("普通循环耗时："+(d4-d3));
    }
}
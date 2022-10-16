public class Demo26 {
    // 贷款问题2.0 while循环
    public static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (i<=10){
            int j = 1;
            while (j<=12){
                System.out.println("-----第"+i+"年第"+j+"月还款1万元");
                total++;
                System.out.println("-----累计已还款"+total+"万，剩余还款"+(120-total)+"万");
                j++;
            }
            i++;
        }
    }
}

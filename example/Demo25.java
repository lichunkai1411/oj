public class Demo25 {
    // 循环嵌套 贷款问题1.0
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("-----第"+i+"年到了！");
            for (int j = 1; j <=12 ; j++) {
                System.out.println("-----第"+i+"年第"+j+"月还款1万元");
                total++;
                System.out.println("-----累计已还款"+total+"万，剩余"+(120-total)+"万");
            }
        }
    }
}

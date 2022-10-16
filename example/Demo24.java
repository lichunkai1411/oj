public class Demo24 {
    // 还款计算
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("第"+i+"年还款12万！");
            total=total+12;
            System.out.println("累计已还款"+total+"万，剩余还款"+(120-total)+"万");
        }
    }
}

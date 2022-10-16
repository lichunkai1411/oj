public class Text1076 {
    // 百钱买百鸡
    public static void main(String[] args) {
        // 公鸡最多20只
        for (int i = 0; i <= 20; i++) {
            // 母鸡最多33只
            for (int j = 0; j <= 33; j++) {
                // 小鸡数量为100-公鸡-母鸡
                int z = 100-i-j;
                // 满足以下条件打印出来
                if (z%3==0&&5*i+3*j+z/3==100) {
                    System.out.println(i+" "+j+" "+z);
                }
            }
        }
    }
}
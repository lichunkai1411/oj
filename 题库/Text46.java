public class Text46 {
    // 半绳求次
    public static void main(String[] args) {
        // 导入绳长为5000
        int rope = 5000;
        // 定义天数等于0
        int day = 0;
        // 判断绳长大于5
        while (rope > 5) {
            // 当绳长大于5时除2并赋值给绳长
            rope = rope / 2;
            // 天数递增加1
            day += 1;
        }
        // 输出打印天数
        System.out.println(day);
    }
}

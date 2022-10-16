package Java入门;

public class Text09 {
    public static void main(String[] args) {
        String num = "9";
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            // 使用parseLong方法将一个字符串转换成数字
            sum+=Long.parseLong(num);
            num+="9";
            if (i==9){
                System.out.println(sum);
            }
        }
    }
}

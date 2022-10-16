import java.text.DecimalFormat;

public class Demo11 {
    // 解决误差问题
    public static void main(String[] args) {
        double a = 15.3;
        double b = 3;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s = decimalFormat.format(a / b);
        System.out.println(s);
    }
}

import java.util.Scanner;

public class Text11 {
    // 肉蛋葱鸡
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 引用一个字符串
        String eat = input.next();
//        不建议此方法写
        // if (eat.equals("meat") || eat.equals("egg") || eat.equals("chicken") || eat.equals("scallion")) {
        // 如果是"meat"||"egg"||"scallion"||"chicken"
        if ("meat".equals(eat) || "egg".equals(eat) || "chicken".equals(eat) || "scallion".equals(eat)) {
            // 输出"wow"
            System.out.println("wow");
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }
    }
}

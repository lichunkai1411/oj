import java.util.Scanner;

public class Text11 {
    // 读取用户输入
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eat = sc.next();
        // 引用一个字符串
        // if (eat.equals("meat") || eat.equals("egg") || eat.equals("chicken") || eat.equals("scallion")) {
        if ("meat".equals(eat) || "egg".equals(eat) || "chicken".equals(eat) || "scallion".equals(eat)) {
            // 如果是"meat"||"egg"||"scallion"||"chicken"
            System.out.println("wow");
            // 输出"wow"
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }
    }
}

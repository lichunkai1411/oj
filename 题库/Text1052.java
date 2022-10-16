public class Text1052 {
    // 打印能被3整除的数
    public static void main(String [] args) {
        int x = 36 ;
        while (x < 107) {
            x++;
            // 如果对3取余等于0
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
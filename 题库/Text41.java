public class Text41 {
    // for循环
    public static void main(String[] args) {
        double i = 8848;
        // 进入for循环
        for (int fold = 0; i < 8848; fold++) {
            // 折叠后续乘2
            i = i * 2;
            if (i > 8848){
                System.out.println(fold);
            }
        }
    }
}

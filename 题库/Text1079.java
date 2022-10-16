public class Text1079 {
    // 百马百担
    public static void main(String[] args) {
        // 进入for循环
        // 大马最多33
        for (int big = 0; big < 34 ; big++) {
            // 中马最多50
            for (int medium = 0; medium < 51; medium++) {
                // 小马最多100
                for (int small = 0; small < 101; small++) {
                    // 如果大马加小马加中马等于100并且大马乘3加中马乘2加小马除2等于100并且小马能被2整除
                    if(big + small + medium == 100 && 3*big + 2 * medium + small/2 == 100 && small%2==0) {
                        // 输出打印大马
                        System.out.print(big);
                        // 输出打印空格
                        System.out.print(" ");
                        // 输出打印中马
                        System.out.print(medium);
                        // 输出打印空格
                        System.out.print(" ");
                        // 输出打印小马
                        System.out.println(small);
                    }
                }
            }

        }
    }
}
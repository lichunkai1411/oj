import java.util.Scanner;

public class Demo13 {
    // while循环练习
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 1;
        while (b==1){
            System.out.println("检查学习任务了，合格率吗？(yes/no)");
            String chiose = scanner.next();
            if ("yes".equals(chiose)){
                System.out.println("恭喜合格了");
            }else {
                System.out.println("不合格！ 继续学习");
                System.out.println("上午阅读教材，学习理论部分，下午上机编程，掌握代码部分！");
            }
        }
    }
}

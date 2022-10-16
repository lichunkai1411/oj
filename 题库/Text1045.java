import java.util.Scanner;
public class Text1045{
    // 得降级吗？
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // 定义变量必修课和全部课程
        int must = scan.nextInt();
        int all = scan.nextInt();
        // 如果必修课或者全部课程小于0
        if (must < 0 || all < 0 ) {
            // 打印错误
            System.out.println("error");
            // 否则如果必修课小于等于全部课程
        }else if (must <= all) {
            // 如果必修课小于4
            if (must < 4) {
                // 打印正常
                System.out.println("正常");
                // 否则
            }else {
                // 如果全部课程小于6
                if (all < 6 ) {
                    // 打印降级可跟班
                    System.out.println("降级可跟班");
                    // 否则
                }else  {
                    // 打印降级
                    System.out.println("降级");
                }
            }
            // 否则如果必修课大于所有课程
        }else if (must > all) {
            // 打印error
            System.out.println("error");
        }
    }
}
import java.util.Scanner;

public class Text1047{
    // 几班学生？
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // 将输入的整数保存到班级中
        int classes = scan.nextInt();
        // 如果班级大于5或小于1
        if (classes > 5 || classes < 1) {
            // 打印error
            System.out.println("error");
            // 否则
        }else {
            switch (classes){
                case 1:
                    System.out.println("学生是1班学生");
                    break;
                case 2:
                    System.out.println("学生是2班学生");
                    break;
                case 3:
                    System.out.println("学生是3班学生");
                    break;
                case 4:
                    System.out.println("学生是4班学生");
                    break;
                case 5:
                    System.out.println("学生是5班学生");
                    break;
            }
        }
    }
}
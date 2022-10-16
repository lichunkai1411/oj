import java.util.Scanner;
public class Text1046 {
    // 是什么生肖年份？
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // 接收一个年份保存到year中
        int year = scan.nextInt();
        // 生肖为十二个
        int twelve = year%12;
        // 对12取余
        switch (twelve) {
            case 0 :
                System.out.println("猴年");
                break;
            case 1:
                System.out.println("鸡年");
                break;
            case 2:
                System.out.println("狗年");
                break;
            case 3:
                System.out.println("猪年");
                break;
            case 4:
                System.out.println("鼠年");
                break;
            case 5:
                System.out.println("牛年");
                break;
            case 6:
                System.out.println("虎年");
                break;
            case 7:
                System.out.println("兔年");
                break;
            case 8:
                System.out.println("龙年");
                break;
            case 9:
                System.out.println("蛇年");
                break;
            case 10:
                System.out.println("马年");
                break;
            case 11:
                System.out.println("羊年");
                break;
            default:
                System.out.println("error");
        }
    }
}
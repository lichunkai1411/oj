import java.util.Scanner;

public class Demo9 {
    // 超市收银
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String pName1 = "苹果";
        double pPrice1 = 9.9;
        String pNum1 = "1001";

        String pName2 = "香蕉";
        double pPrice2 = 3.9;
        String pNum2 = "1002";

        String pName3 = "梨";
        double pPrice3 = 6.9;
        String pNum3 = "1003";

        System.out.println("欢迎来到超市收银系统");
        System.out.println("请输入商品编号");
        String num = scanner.next();
        System.out.println("请输入商品数量");
        int count = scanner.nextInt();
        String pName = "";
        double pPrice = 0;
        if (num.equals(pNum1)) {
            pName=pName1;
            pPrice=pPrice1;
        }else if (num.equals(pNum2)){
            pName=pName2;
            pPrice=pPrice2;
        }else if (num.equals(pNum3)){
            pName=pName3;
            pPrice=pPrice3;
        }else {
            System.out.println("查无此商品！");
        }
        System.out.println("您购买的是："+pName+"数量:"+count+"总价:"+count*pPrice);
        System.out.println("您需要袋子吗？ 一个袋子一毛钱 1.要 2.不需要");
        int choice = scanner.nextInt();
        if (choice==1){
            System.out.println("您一共消费"+((count*pPrice)+0.1));
        }else if (choice==2){
            System.out.println("您一共消费"+count*pPrice);
        }
    }
}

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardNum1 = "1001";
        String password1 = "123456";
        double banlance1 = 10000;

        String cardNum2 = "1002";
        String password2 = "123456";
        double banlance2 = 20000;

        String cardNum3 = "1003";
        String password3 = "123456";
        double banlance3 = 30000;

        System.out.println("欢迎来到本行！");
        int count =0;
        while (true) {
            System.out.println("请输入卡号：");
            String cardNum = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();

            double banlance;
            if (cardNum.equals(cardNum1) && password.equals(password1)) {
                banlance = banlance1;
                System.out.println("输入正确！ 用户：卡1 余额："+banlance);
            } else if (cardNum.equals(cardNum2) && password.equals(password2)) {
                banlance = banlance2;
                System.out.println("输入正确！ 用户：卡2 余额："+banlance);
            } else if (cardNum.equals(cardNum3) && password.equals(password3)) {
                banlance = banlance3;
                System.out.println("输入正确！ 用户：卡3 余额："+banlance);
            } else {
                count++;
                if (count>=3){
                    System.out.println("您已经三次输入错误，银行卡已经被锁定");
                    break;
                }else {
                    System.out.println("您已经"+count+"次输入错误！还有"+(3-count)+"次机会");
                    continue;
                }
            }

            while (true) {

                System.out.println("请输入要办理的业务：'存款' '取款' '退出' ");
                String choice = scanner.next();

                switch (choice) {
                    case "存款" -> {
                        System.out.println("请输入存款金额：");
                        double money1 = scanner.nextDouble();
                        if (money1 > 0) {
                            banlance = banlance + money1;
                            System.out.println("存款成功！存入：" + money1 + "元，余额：" + banlance + "元");
                        } else {
                            System.out.println("存款金额输入错误！");
                        }
                    }
                    case "取款" -> {
                        System.out.println("请输入取款金额：");
                        double money2 = scanner.nextDouble();
                        if (money2 > 0 && money2 <= banlance) {
                            banlance = banlance - money2;
                            System.out.println("取款成功！取出：" + money2 + "元，余额：" + banlance + "元");
                            System.out.println("取款金额输入错误！");
                        }
                    }
                    case "退出" -> System.out.println("办理结束，请收好您的磁卡！");
                    default -> System.out.println("输入错误，请重新选择：");
                }
            }
        }
    }
}
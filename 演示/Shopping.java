import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========购物管理系统========");
        System.out.println("========1.登陆=======");
        System.out.println("========2.退出=======");
        System.out.println("请选择：");
        int choice1 = input.nextInt();
        if (choice1 == 1) {
            int count = 0;
            while (true) {
                System.out.println("请输入用户名：");
                String name = input.next();
                System.out.println("请输入密码：");
                String pwd = input.next();
                if ("aaa".equals(name) && "123".equals(pwd)) {
                    while (true) {
                        System.out.println("========主菜单========");
                        System.out.println("1.客户信息管理");
                        System.out.println("2.购物结算");
                        System.out.println("3.真情回馈");
                        System.out.println("4.注销");
                        int choice2 = input.nextInt();
                        if (choice2 == 1) {
                            System.out.println("======客户信息管理======");
                            System.out.println("1.添加用户");
                            System.out.println("2.年龄统计");
                            System.out.println("3.返回主菜单");
                            System.out.println("请选择：");
                            int choice4 = input.nextInt();
                            if (choice4==1){
                                StringBuilder clist = new StringBuilder();
                                while (true){
                                    System.out.println("请输入姓名：");
                                    String user = input.next();
                                    System.out.println("请输入年龄：");
                                    int age = input.nextInt();
                                    clist.append(user).append("-----").append(age).append("/n");
                                    System.out.println("添加成功!继续添加请输入1，输入其他内容停止：");
                                    String choice3 = input.next();
                                    if ("1".equals(choice3)){
                                        continue;
                                    }else {
                                        System.out.println(clist);
                                        break;
                                    }
                                }
                            }else if (choice4==2){
                                int up30 = 0;
                                int down30 = 0;
                                for (int i = 1; i <=10 ; i++) {
                                    System.out.println("请输入姓名：");
                                    String user1 = input.next();
                                    System.out.println("请输入年龄：");
                                    int age1 = input.nextInt();
                                    if (age1>=30){
                                        up30++;
                                    }else {
                                        down30++;
                                    }
                                }
                                System.out.println("30岁以上比例："+up30/10.0*100+"%");
                                System.out.println("30岁以下比例："+down30/10.0*100+"%");
                            }else{
                                continue;
                            }

                        } else if (choice2 == 2) {
                            System.out.println("商品列表：101.苹果5元 102.梨6元 103.香蕉3元");
                            double total = 0;
                            while (true){
                                System.out.println("请输入商品编号：");
                                int pid = input.nextInt();
                                System.out.println("请输入商品数量：");
                                int pnum = input.nextInt();
                                String pname  = "";
                                double price = 0;
                                if (pid==101){
                                    pname="苹果";
                                    price=5;
                                }else if (pid==102){
                                    pname="梨";
                                    price=6;
                                }else if (pid==103){
                                    pname="香蕉";
                                    price=3;
                                }else {
                                    System.out.println("没有此商品！");
                                }
                                double t = price*pnum;
                                total = total+t;
                                System.out.println("当前添加的是：" +pname+"  数量:"+pnum+"   总价："+t);
                                System.out.println("结算请输入1，输入其他则继续添加");
                                int choice5 = input.nextInt();
                                if (choice5==1){
                                    break;
                                }
                            }
                            System.out.println("合计应付款："+total);
                            System.out.println("请输入付款金额：");
                            double money = input.nextDouble();
                            if (money<=total){
                                System.out.println("金额不足！");
                            }else {
                                System.out.println("收款"+money+"元，应付款"+total+"元 ，找零"+(money-total)+"元");
                                System.out.println("欢迎下次光临！");
                            }
                        } else if (choice2 == 3) {
                            System.out.println("开始抽奖------正在生成幸运数字------");
                            double r = Math.random();
                            int n = (int)(r*100+1);
                            System.out.println(n);
                            if (n<=5){
                                System.out.println("恭喜您获得一等奖：500元购物券！");
                            }else if (n<=15){
                                System.out.println("恭喜您获得二等奖：10元话费！");
                            }else {
                                System.out.println("谢谢惠顾！");
                            }
                        } else if (choice2 == 4) {
                            continue;
                        } else {
                            System.out.println("输入错误！");
                            continue;
                        }
                    }
                } else {
                    count++;
                    if (count >= 3) {
                        System.out.println("已经三次输入错误，强制退出！");
                        break;
                    } else {
                        System.out.println("输入错误，请重新输入！");
                        continue;
                    }
                }
            }
        } else if (choice1 == 2) {
            System.out.println("退出系统！");
        } else {
            System.out.println("输入错误！");
        }
    }
}
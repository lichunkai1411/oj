package 多态;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：17:13
 *
 * @author lck
 */

/**
 *          ClassCastException:类型转换异常
 *                  在引用数据类型的强转中，[实际类型]和[目标类型]不匹配，就会出现此异常
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：1.国内订单  2.国外订单");
        // 首先创建一个接口类型的变量(引用类型初始化为null)
        OrderService orderService = null;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // 创建国内订单的业务类(根据具体业务需求创建不同的对象)
                orderService = new OrderServiceImpl();
                break;
            case 2:
                // 创建国外订单的业务类(根据具体业务需求创建不同的对象)
                orderService = new OverseasServiceImpl();
                break;
            default:
                System.out.println("您的输入有误，请检查您的输入！");
        }
        // instanceof：判断左边引用，是否是右边的数据类型
        if (orderService instanceof OverseasServiceImpl){
            // 通过多态的转型技术实现父类访问子类的特有方法
            OverseasServiceImpl overseasService = (OverseasServiceImpl) orderService;
            overseasService.check();
        }



        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}

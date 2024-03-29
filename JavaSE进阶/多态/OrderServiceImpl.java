package 多态;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：17:08
 * @author lck
 */
public class OrderServiceImpl implements OrderService{
    @Override
    public void create() {
        System.out.println("创建订单");
    }

    @Override
    public void findOne() {
        System.out.println("查询单个订单");
    }

    @Override
    public void findList() {
        System.out.println("查询订单列表");
    }

    @Override
    public void cancel() {
        System.out.println("取消订单");
    }

    @Override
    public void finish() {
        System.out.println("完成订单");
    }

    @Override
    public void paid() {
        System.out.println("支付订单");
    }
}

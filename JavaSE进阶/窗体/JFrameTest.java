package 窗体;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：17:37
 * @author lck
 */
public class JFrameTest {
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame jFrame = new JFrame();
        // 设置窗体大小
        jFrame.setSize(514,595);
        // 修改窗体的关闭模式
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 设置窗体标题
        jFrame.setTitle("这是我的第一个窗体！");
        // 设置窗体可见(一定要放到最后否则会丢失资源)
        jFrame.setVisible(true);
    }
}

package 窗体.按钮;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：17:55
 */

import javax.swing.*;

/**
 *      案例演示：
 *
 *      ----------------------------------------------------------------
 *
 *      JButton构造方法：
 *          1.public JButton():创建一个空白的按钮
 *          2.public JButton(String text):创建一个带文本的按钮
 *
 *       ----------------------------------------------------------------
 *       注意：如果取消了窗体的默认布局，就需要手动指定组件的摆放位置了
 */
public class JButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 取消窗体的默认布局
        frame.setLayout(null);
        // 1.创建按钮对象
        JButton button = new JButton("点我啊~");
        button.setBounds(50,50,100,100);
        // 2.将按钮添加到窗体的[面板对象]中
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

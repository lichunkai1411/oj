package 窗体.事件;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：23:01
 * @author lck
 */

import javax.swing.*;

/**
 *      动作事件：ActionListener
 *
 *      1.鼠标点击  2.空格按键
 * @author lck
 */
public class ActionListenerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("按钮");
        button.setBounds(0,0,100,100);
        frame.getContentPane().add(button);
        button.addActionListener(e -> System.out.println("我被点了"));
        frame.setVisible(true);
    }

}

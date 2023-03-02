package 窗体.事件;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：23:01
 * @author lck
 */

/**
 *      焦点：程序的注意力集中在某一个组件上
 *
 *      注意：按钮组件比较特殊，在创建好之后，程序的焦点，默认就停留在按钮组件上面
 *           - 但按钮组件，其实不需要占用程序的焦点
 *           - 可以通过button.setFocusable(false);取消焦点
 */
public class Tips {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("按钮");
        button.setBounds(0,0,100,100);
        frame.getContentPane().add(button);

        // ----------------------------------------------------------------

        button.addActionListener(e -> System.out.println("我被点了！！！"));
        button.setFocusable(false);

        // ----------------------------------------------------------------

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}

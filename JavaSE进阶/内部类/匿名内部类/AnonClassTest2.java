package 内部类.匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:19
 * @author lck
 */
public class AnonClassTest2 {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,300);
        frame.setLayout(null);

        JButton jButton = new JButton("点我啊~");
        jButton.setBounds(0,0,100,100);
        frame.getContentPane().add(jButton);
        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了！");
            }
        });
        frame.setVisible(true);
    }
}

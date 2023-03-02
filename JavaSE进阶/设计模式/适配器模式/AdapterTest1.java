package 设计模式.适配器模式;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-14
 * Time：09:13
 * @author lck
 */
public class AdapterTest1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 未使用适配器
        /*frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了...");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });*/

        // 使用适配器
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了...");
            }
        });
        frame.setVisible(true);
    }
}

package 窗体.事件;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：23:01
 *
 * @author lck
 */

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 *      键盘事件：KeyListener
 *
 * @author lck
 */
public class KeyListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode ==37){
                    System.out.println("左");
                }else if (keyCode ==    38){
                    System.out.println("上");
                }else if (keyCode == 39){
                    System.out.println("右");
                }else if (keyCode == 40){
                    System.out.println("下");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}

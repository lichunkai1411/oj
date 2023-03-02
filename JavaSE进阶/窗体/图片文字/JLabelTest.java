package 窗体.图片文字;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：22:39
 * @author lck
 */

import javax.swing.*;

/**
 *      案例：使用JLabel展示文本和图片
 *
 *      JLabel构造方法：
 *          JLabel(String text)使用指定的文本创建一个JLabel对象
 *          JLabel(Icon image)创建一个具有指定图像的JLabel对象
 */
public class JLabelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1080,1080);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        // JLabel展示文本
        JLabel label = new JLabel("听君一席话");
        label.setBounds(50,50,100,100);
        frame.getContentPane().add(label);
        JLabel jLabel = new JLabel("如听一席话");
        jLabel.setBounds(150,50,100,100);
        frame.getContentPane().add(jLabel);
        // JLabel展示图片
        JLabel img = new JLabel(new ImageIcon("/Users/lck/Desktop/img/6.JPG"));
        img.setBounds(50,150,1080,1080);
        frame.getContentPane().add(img);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notepad extends JFrame {
    JTextArea jta;

    class OpenSaveFileActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JFileChooser jfc = new JFileChooser();
            String command = e.getActionCommand();
            if (command.equals("open")) {
                jfc.showOpenDialog(null);
            } else {
                jfc.showSaveDialog(null);
            }
            jfc.setVisible(true);
            File file = jfc.getSelectedFile();
            if (file != null) {
                if (command.equals("open")) {
                    loadFile(file);
                } else {
                    saveFile(file);

                }
            }

        }
    }

    public void loadFile(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String all = "";
            try {
                while ((line = br.readLine()) != null) {
                    all += line;
                }
                fr.close();
                br.close();
            } catch (IOException ioe) {
                JOptionPane.showConfirmDialog(null, "读取文件失败!",
                        "错误", JOptionPane.ERROR_MESSAGE);

            }
            jta.setText(all);
        } catch (FileNotFoundException ffe) {
            JOptionPane.showConfirmDialog(null, "找不到文件!",
                    "提示", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveFile(File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(jta.getText());
            bw.close();
            fw.close();
        } catch (IOException ioe) {
            JOptionPane.showConfirmDialog(null, "文件写入失败",
                    "错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Notepad() {
        int x;
        int y;
        int width;
        int height;

        setTitle("记事本");
        setBounds(x = 100, y = 100, width = 400, height = 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);

        JMenu menu = new JMenu("文件");
        jmb.add(menu);

        JMenuItem omfi = new JMenuItem("打开", new ImageIcon("./image/open.png"));
        omfi.setActionCommand("open");
        omfi.addActionListener(new OpenSaveFileActionListener());
        menu.add(omfi);

        JMenuItem sfim = new JMenuItem("保存", new ImageIcon("./image/save.png"));
        sfim.setActionCommand("save");
        sfim.addActionListener(new OpenSaveFileActionListener());
        menu.add(sfim);

        JScrollPane jsp = new JScrollPane();
        jta = new JTextArea();
        jsp.setViewportView(jta);
        add(jsp);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Notepad();
    }
}

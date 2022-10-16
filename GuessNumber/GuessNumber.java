import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber {
    int[] answers = new int[4];
    int[] guesses = new int[4];
    JTextField guess1;
    JTextField guess2;
    JTextField guess3;
    JTextField guess4;
    JButton guessBth;
    JButton resetBth;
    private class GuessEventListener implements ActionListener{
        private void receiveGuesses(){
            try {
                guesses[0] = Integer.parseInt(guess1.getText());
                guesses[1] = Integer.parseInt(guess2.getText());
                guesses[2] = Integer.parseInt(guess3.getText());
                guesses[3] = Integer.parseInt(guess4.getText());
            }catch (Exception e){
                throw (e);
            }

        }
        private void compare(){
            int a = 0;
            int b = 0;
            for (int i = 0; i < 4; i++) {
                if (guesses[i] == answers[i]){
                    a = a + 1;
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (guesses[i] == answers[j] && i!=j){
                        b = b + 1;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,a+"A"+b+"B","提示",JOptionPane.INFORMATION_MESSAGE);
        }
        public boolean hasDuplicateNumbers(){
            for (int i = 0; i < 4; i++) {
                int j ;
                for ( j = i+1; j < 4; j++) {
                    if (guesses[j] == guesses[i]){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean isLegalRange(){
            if (guesses[0] < 0 || guesses[0] > 9 || guesses[1] < 0 || guesses[1] > 9 || guesses[2] < 0 || guesses[2] > 9 ||guesses[3] < 0 || guesses[3] > 9){
                return false;
            }else {
                return true;
            }
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                receiveGuesses();
            }catch (Exception e1){
                JOptionPane.showMessageDialog(null,"请输入数字","注意",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (hasDuplicateNumbers()){
                JOptionPane.showMessageDialog(null,"有重复数字","注意",JOptionPane.WARNING_MESSAGE);
            }else if (!isLegalRange()){
                JOptionPane.showMessageDialog(null,"有超出0-9范围的数字","注意",JOptionPane.WARNING_MESSAGE);
            }else {
                compare();
            }
        }
    }
    class RsestActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            generateAnswers();
            guess1.setText("");
            guess2.setText("");
            guess3.setText("");
            guess4.setText("");
            JOptionPane.showMessageDialog(null,"已经重置游戏","信息",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //构造器
    GuessNumber(){
        this.generateAnswers();
        JFrame jf = new JFrame();
        jf.setBounds(900,300,500,400);
        jf.setTitle("新猜数字");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        JLabel jl = new JLabel("新猜数字");//标题
        jl.setBounds(200,5,100,30);
        jf.add(jl);
        JLabel jl1 = new JLabel("请输入四个0-9之间不重复的整数");
        jl1.setBounds(145,40,200,30);
        jf.add(jl1);
        guess1 = new JTextField();
        guess2 = new JTextField();
        guess3 = new JTextField();
        guess4 = new JTextField();
        guess1.setBounds(70,80,80,50);
        guess2.setBounds(160,80,80,50);
        guess3.setBounds(250,80,80,50);
        guess4.setBounds(340,80,80,50);
        jf.add(guess1);
        jf.add(guess2);
        jf.add(guess3);
        jf.add(guess4);
        guessBth = new JButton("猜一下");
        guessBth.setBounds(100,180,100,40);
        guessBth.addActionListener(new GuessEventListener());
        jf.add(guessBth);
        resetBth = new JButton("再玩一次");
        resetBth.setBounds(280,180,100,40);
        resetBth.addActionListener(new RsestActionListener());
        jf.add(resetBth);
        JTextPane jtp = new JTextPane();
        jtp.setText("游戏会生成四个0-9之间不重复的整数，请你猜出这四个整数。" +
                "如果你猜测的数字中有两个存在答案数字中且位置正确，那么会反馈2A" +
                "如果你猜测的数字中有两个存在答案数字中且位置不对，那么要反馈2B" +
                "例如答案数字是1、2、3、4，你的猜测是1、2、3、4，那么就会反馈2A2B。");
        jtp.setBounds(5,250,480,150);
        jtp.setBackground(Color.CYAN);
        jf.add(jtp);
        jf.setVisible(true);
    }
    //生成答案数字
    private void generateAnswers(){
        int i = 0;
        while (i < 4){
            int number = (int) (Math.random()*10);
            boolean exists = false;
            for (int j = 0; j < i+1; j++) {
                if (answers[j] == number){
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                answers[i] = number;
                i = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        GuessNumber g = new GuessNumber();
        for (int i = 0; i < 4; i++) {
            System.out.println(g.answers[i]);
        }
    }
}

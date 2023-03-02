import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-24
 * Time：10:29
 */
public class puppyTraining {


        public static String reward(String moves) {
            int x = 0;
            int y = 0;
            for (int i = 0; i < moves.length(); i++) {
                char move = moves.charAt(i);
                if (move == 'U') {
                    y += 1;
                } else if (move == 'D') {
                    y -= 1;
                } else if (move == 'L') {
                    x -= 1;
                } else if (move == 'R') {
                    x += 1;
                }
            }
            if (x == 0 && y == 0) {
                return "Excellent";
            } else {
                return "Try again";
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String moves = input.next();
            System.out.println(reward(moves));
        }
    }






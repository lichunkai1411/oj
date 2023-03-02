import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-23
 * Time：12:45
 */
public class howManyBonusesAreThere {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String bonus = input.next();
            String points = input.next();
            int count = 0;
            for (int i = 0; i < points.length(); i++) {
                if (bonus.indexOf(points.charAt(i)) != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }



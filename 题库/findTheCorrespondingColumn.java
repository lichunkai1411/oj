import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-23
 * Time：12:24
 */
public class findTheCorrespondingColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(getExcelColumnLabel(num-1));
    }
    public static String getExcelColumnLabel(int num) {

        String temp = "";

        double i = Math.floor(Math.log(25.0 * (num) / 26.0 + 1) / Math.log(26)) + 1;

        if (i > 1) {

            double sub = num - 26 * (Math.pow(26, i - 1) - 1) / 25;

            for (double j = i; j > 0; j--) {

                temp = temp + (char) (sub / Math.pow(26, j - 1) + 65);

                sub = sub % Math.pow(26, j - 1);

            }

        } else {

            temp = temp + (char) (num + 65);

        }

        return temp;

    }


}

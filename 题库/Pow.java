import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-29 22:02
 */
public class Pow {
    public static void main(String[] args) {
        stdInput();
    }

    public static void stdInput() {
        Scanner input = new Scanner(System.in);
        String inputStr = input.next();
        String[] inputArray = inputStr.split(",");
        doProgram(Double.valueOf(inputArray[0]), Integer.valueOf(inputArray[1]));
    }

    public static void doProgram(double x, Integer n) {
        //Write Code Here...
        double a = Math.pow(x, n);
        System.out.printf("%.5f\n", a);
    }
}
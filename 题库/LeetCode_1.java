import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-10-15 09:24
 */
public class LeetCode_1 {
    public static void main(String[] args) {

        stdInput();
    }

    public static void stdInput() {
        Scanner input = new Scanner(System.in);
        String inputStr = input.next();
        String[] inputArray = inputStr.replace('[', ' ').replace(']', ' ').trim().split(",");
        Integer[] array = new Integer[inputArray.length];
        System.out.println(inputArray);
        int process = 0;
        for (String a :
                inputArray) {
            array[process] = Integer.valueOf(a);
            process++;
        }
        doProgram(array);
    }

    public static void doProgram(Integer[] array) {

    }
}

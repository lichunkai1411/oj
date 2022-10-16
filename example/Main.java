import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stdInput();
    }

    public static void stdInput() {
        Scanner input = new Scanner(System.in);
        String inputStr = input.next();
        String[] inputArray = inputStr.replace('[', ' ').replace(']', ' ').trim().split(",");
        Integer[] array = new Integer[inputArray.length];
        int proc = 0;
        for (String a :
                inputArray) {
            array[proc] = Integer.valueOf(a);
            proc++;
        }
        doProgram(array);
    }

    public static void doProgram(Integer[] array) {
        // 请在此处编写代码
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length; k++) {
                if (array[j] == array[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(array[j]);
                count = 0;
            }
        }
    }
}
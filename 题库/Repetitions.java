import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-15 15:00
 */
public class Repetitions {
    public static void main(String[] args) {
        stdInput();
    }
    public static void stdInput(){
        Scanner input = new Scanner(System.in);
        String inputStr = input.next();
        String[] inputArray = inputStr.replace('[',' ').replace(']',' ').trim().split(",");
        Integer[] array = new Integer[inputArray.length];
        System.out.println(inputArray);
        int proc = 0;
        for (String a: inputArray) {
            array[proc] = Integer.valueOf(a);
            proc++;
        }
        doProgram(array);
    }
    public static int doProgram(Integer[] array){
        int n = array.length - 1;
        int highBit = 0;
        int temp = n;
        while (temp != 0) {
            highBit = temp & (-temp);
            temp -= highBit;
        }
        int duplicate = 0;
        for (int i = 1; i <= highBit; i <<= 1) {
            int countArr = 0, countNum = 0;
            for (int num : array) {
                int bit = num & i;
                if (bit != 0) {
                    countArr++;
                }
            }
            for (int j = 1; j <= n; j++) {
                int bit = j & i;
                if (bit != 0) {
                    countNum++;
                }
            }
            if (countArr > countNum) {
                duplicate += i;
            }
        }
        return duplicate;
    }
}

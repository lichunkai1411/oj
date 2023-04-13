import java.util.Scanner;

public class Funsion_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] strArr = input.split(",");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            try {
                arr[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.out.println("不是数字");
                return;
            }
        }

        if (arr.length == 0) {
            System.out.println("没有合法分隔符");
            return;
        } else if (arr.length == 1) {
            System.out.println("是");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] != 0) {
                System.out.println("否");
                return;
            }
        }

        System.out.println("是");
    }
}

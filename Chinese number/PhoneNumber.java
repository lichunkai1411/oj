import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        String[] strings = phone.split(" ");
//        strings[0],strings[1]
        try {
            new BigInteger(strings[1]);
        } catch (Exception e) {
            System.out.println("Not num");
            return;
        }
        if (Objects.equals(strings[0], "+86") && strings[1].length() == 11) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
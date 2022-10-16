import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static ArrayList<Integer> getNumbers(int n) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            number.add((int) (Math.random() * 1000));
        }
        return number;
    }
    public static void main(String[] args) {
        ArrayList<Integer> i = getNumbers(1000);
        Collections.sort(i);
        System.out.println(i.get(999));
        Arrays.asList(i);
        System.out.println(i.get(999));
    }
}

import java.util.ArrayList;

public class ListPractice {
    public static ArrayList generateData(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add((int) Math.random() * 1000 + 1);
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateData(1000);
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}

import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-29 21:54
 */
public class romanNumeralsToIntegers {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        System.out.println(r2a(mScanner.nextLine()));
    }
    public static int r2a(String m) {
        int graph[] = new int[400];
        graph['I'] = 1;
        graph['V'] = 5;
        graph['X'] = 10;
        graph['L'] = 50;
        graph['C'] = 100;
        graph['D'] = 500;
        graph['M'] = 1000;
        char[] num = m.toCharArray();
        int sum = graph[num[0]];
        for (int i = 0; i < num.length - 1; i++) {
            if (graph[num[i]] >= graph[num[i + 1]]) {
                sum += graph[num[i + 1]];
            } else {
                sum = sum + graph[num[i + 1]] - 2 * graph[num[i]];
            }
        }
        return sum;
    }
}

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-10-31 17:00
 */
public class RomanToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        String s1 = s + "0";
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        hashMap.put('0', 0);
        for (int i = 0; i < s1.length() - 1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s1.charAt(i + 1);
            if (hashMap.get(c1) >= hashMap.get(c2)) {
                res = res + hashMap.get(c1);
            } else {
                res = res - hashMap.get(c1);
            }
        }
        return res;
    }
}



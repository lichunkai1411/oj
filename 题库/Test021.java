public class Test021 {
    public static void main(String[] args) {
        int number = findMagicalNumber();
        System.out.println(number);
    }

    public static int findMagicalNumber() {
        for (int i = 1000; i <= 9999; i++) {
            if (isMagicalNumber(i)) {
                return i;
            }
        }
        return -1; // 如果找不到满足条件的神奇数字，则返回-1
    }

    public static boolean isMagicalNumber(int num) {
        int reverseNum = reverseNumber(num);
        return num * 4 == reverseNum;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}

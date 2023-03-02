import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-24
 * Time：10:24
 */
public class flipNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println(getMaxNumber(num));  // 输出 9969
        }

        public static int getMaxNumber(int num) {
            // 将数字转换为字符串
            String numStr = String.valueOf(num);
            // 初始化最大数
            int maxNum = num;
            // 循环遍历字符串中的每一位
            for (int i = 0; i < numStr.length(); i++) {
                // 将当前位的数字修改
                if (numStr.charAt(i) == '6' || numStr.charAt(i) == '9') {
                    char[] numChars = numStr.toCharArray();
                    numChars[i] = numChars[i] == '6' ? '9' : '6';
                    // 将修改后的数字转换为数字并更新最大数
                    int tempNum = Integer.parseInt(new String(numChars));
                    if (tempNum > maxNum) {
                        maxNum = tempNum;
                    }
                }
            }
            // 返回最大数
            return maxNum;
        }
    }


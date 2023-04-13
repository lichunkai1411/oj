import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-13
 * Time：09:54
 */
public class Text009addTwoNumbers {
    public static void main(String[] args) {
        // 创建一个从命令行读取输入的Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 创建三个整数类型的ArrayList集合对象
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // 无限循环，一直读取输入，直到输入的数小于0
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            list1.add(number); // 将读取到的数添加进第一个ArrayList集合中
        }
        // 同上，再读取一遍输入，将读取到的数添加进第二个ArrayList集合中
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            list2.add(number);
        }
        // 初始化一个进位变量和长度变量
        int con = 0;
        int length = list1.size() > list2.size() ? list1.size() : list2.size();
        // 如果第一个ArrayList集合长度小于最大长度，则将其填充0直至长度等于最大长度
        if (list1.size() < length) {
            while (list1.size() <= length) {
                list1.add(0);
            }
        }
        // 如果第二个ArrayList集合长度小于最大长度，则将其填充0直至长度等于最大长度
        if (list2.size() < length) {
            while (list2.size() <= length) {
                list2.add(0);
            }
        }
        // 遍历两个ArrayList集合的值，将其对应位置的值相加再加上进位，将求得的个位数添加进第三个ArrayList集合中，更新进位变量
        for (int i = 0; i < length; i++) {
            int sum = list1.get(i) + list2.get(i) + con;
            list3.add(sum % 10);
            con = sum / 10;
        }
        // 如果最高位上的进位不为0，则将其添加进第三个ArrayList集合的最后面
        if (con > 0) {
            list3.add(1);
        }
        // 遍历第三个ArrayList集合，将其输出到命令行中
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i));
            // 如果不是最后一个数，则输出一个空格
            if (i != list3.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
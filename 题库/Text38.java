import java.util.Scanner;

public class Text38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 获取输入的字符串
        String inputStr = scanner.next();
        // 获取字符串长度
        int inputStrLength = inputStr.length();
        // 字符串是否包含大写
        boolean existUpperCase = false;
        // 字符串是否包含小写
        boolean existLowerCase = false;
        // 循环获取字符串的每个字符
        for (int i = 0; i < inputStrLength; i++) {
            // 判断第i个字符是大写或小写
            char charAti = inputStr.charAt(i);
            if (Character.isUpperCase(charAti)) {
                // existUpperCase将小写字符转换为大写字符
                existUpperCase = true;
            } else {
                // existLowerCase将大写字符串转换为小写
                existLowerCase = true;
            }
        }
        // 判断字符串是否包含大写或小写
        if (existUpperCase && existLowerCase) {
            System.out.println("error");
        } else if (existUpperCase) {
            System.out.println(inputStr.toLowerCase());
        } else if (existLowerCase) {
            System.out.println(inputStr.toUpperCase());
        }
    }
}
        // String input = "ANYINPUT"
        // if(input.equals(input.toUpperCase()){
        // }else if (input.equals(input.toLowCase()){
        // }else{
        // }
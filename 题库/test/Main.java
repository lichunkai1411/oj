package test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-07-03
 * Time：11:00
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String capitalizedString = capitalizeFirstLetter(input);
        System.out.println(capitalizedString);
    }

    public static String capitalizeFirstLetter(String input) {
        String[] words = input.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) { // 忽略空字符串
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }
        return result.toString().trim();
    }
}
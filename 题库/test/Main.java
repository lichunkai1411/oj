package test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-06-08
 * Time：11:50
 */

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            String result = capitalize(str);
            System.out.println(result);
        }

        public static String capitalize(String str) {
            String[] words = str.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (word.length() > 1) {
                    sb.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase());
                } else {
                    sb.append(Character.toUpperCase(word.charAt(0)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
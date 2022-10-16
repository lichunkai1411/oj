import java.util.Scanner;

public class Text26 {
    // 温度判断
    public static void main(String[] args) {
        Scanner roomtemperature = new Scanner(System.in);
        // 读取用户输入的温度
        double temperature = roomtemperature.nextDouble();
        // 如果温度大于40
        if (temperature > 40) {
            // 输出"resile"
            System.out.println("resile");
            // 否则如果温度大于28
        } else if (temperature > 28) {
            // 输出"youdianre"
            System.out.println("youdianre");
            // 否则如果温度大于18
        } else if (temperature > 18) {
            // 输出"shufu"
            System.out.println("shufu");
            // 否则如果温度大于0
        } else if (temperature > 0) {
            // 输出"youidanlen"
            System.out.println("youdianlen");
            // 否则
        } else {
            // 输出"lensile"
            System.out.println("lensile");
        }
    }
}



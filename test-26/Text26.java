import java.util.Scanner;
public class Text26 {
    // 温度判断
    public static void main(String[] args) {
        Scanner roomtemperature = new Scanner(System.in);
        double temperature = roomtemperature.nextDouble();
        // 读取用户输入的温度
        if (temperature > 40) {
            // 如果温度大于40输出"resile"
            System.out.println("resile");
        } else if (temperature > 28) {
            // 否则如果温度大于28输出"youdianre"
            System.out.println("youdianre");
        } else if (temperature > 18) {
            System.out.println("shufu");
            // 否则如果温度大于18输出
        } else if (temperature > 0) {
            System.out.println("youdianlen");
            // 否则如果温度大于0输出"youidanlen"
        } else {
            System.out.println("lensile");
            // 否则输出"lensile"
        }
    }
}



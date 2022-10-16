package 控制语句;

public class Demo {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i<=130){
            System.out.print(i+"\t");
            // if (i%5 == 0){
               //  System.out.println();
            // }
            count++;
            if (count == 5){
                System.out.println();
                count = 0;
            }
            i++;
        }
    }
}

import java.util.Scanner;

class Exe6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        int max = 0;
        if (x>y){
            if (x>z){
                max = x;
            }else {
                max = z;
            }
        }else {
            if (y>z){
                max = y;
            }else {
                max = z;
            }
        }
        System.out.println(max);
    }
}
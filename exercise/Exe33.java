import java.util.Scanner;

public class Exe33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []data ={2,3,4,5,6,7,8,9};
        int x =input.nextInt();
        boolean found =false;
        for (int k:data){
            if (x==k){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println(x+"在其中");
        }else {
            System.out.println(x+"不在其中");
        }
    }
}

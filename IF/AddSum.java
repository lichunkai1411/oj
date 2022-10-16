
public class AddSum {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for ( int b = 100;i < b; i++) {
            sum += i;
            if (sum>4000){
                break;
            }
        }
        System.out.println(i);
        System.out.println(sum);
    }
}

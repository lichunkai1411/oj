/**
 * @Author Lick
 * @date Created in 2022-11-29 21:53
 */
public class chickensAndRabbitsInTheSameCage {
    public static void main(String[] args) {
        for (int x = 1; x < 35; x ++) {
            for (int y = 1; y < 35; y ++) {
                if (x + y == 35 && 2 * x + 4 * y == 120){
                    System.out.println(x +" "+ y);
                }
            }
        }
    }
}

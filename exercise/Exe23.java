public class Exe23 {
    public static void main(String[] args) {
        int j = 4;
        for (int i = j; i <= 2 * j; i++) {
            switch (i / j) {
                case 0:
                case 1:
                    System.out.print("#");
                    break;
                case 2:
                    System.out.print("*");
            }
        }
    }
}

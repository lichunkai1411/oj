package 控制语句;

/**
 * 使用while/for循环0-130之间的数字，每行显示5个数字
 */
public class Print0_130By5 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 130) {
            System.out.print(i+"\t");
            if (i%5==0){
                System.out.println();
            }
            i++;
        }

        int j = 1;
        int count = 0;
        while (j <= 130) {
            System.out.print(j+"\t");
            count++;
            if (j%5==0) {
                System.out.println();
                count=0;
            }
            j++;
        }

    }
}

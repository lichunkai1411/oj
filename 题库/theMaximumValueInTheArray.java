/**
 * @Author Lick
 * @date Created in 2022-12-02 10:09
 */
public class theMaximumValueInTheArray {
    private static int[] ages;

    public static void main(String[] args) {
        int num = ages[0];
        for (int age:ages){
            if (age>num){
                num=age;
            }
        }
        System.out.println(num);
    }
}

/**
 * @author lck
 */
public class LoveYuXuan {
    public static void main(String[] args) throws InterruptedException{
        int count = 0;
        for (float y = 2.5f;y>-2.0f;y-=0.12f){
            for (float x=-2.3f;x<2.3f;x+=0.041f){
                float a = x*x+y*y-4f;
                if ((a*a*a-x*x*y*y*y)<-0.0f){
                    String str = "I LOVE YOU 陈雨萱";
                    int num = count%str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }else {
                    System.err.print(" ");
                }
            }
            System.err.println();
            Thread.sleep(300);
        }
        System.out.println("我会陪你很久很久");
        System.out.println("不是我想");
        System.out.println("是我会.");
    }
}
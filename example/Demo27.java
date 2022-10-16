public class Demo27 {
    // for 循环练习 鸡兔同笼
    public static void main(String[] args) {
        for (int chicken = 0; chicken <=35 ; chicken++) {
            int rabbit = 35-chicken;
            if (chicken*2+rabbit*4==94){
                System.out.println(chicken+"----"+rabbit);
            }
        }
    }
}

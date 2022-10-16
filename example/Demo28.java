public class Demo28 {
    // 三种100元买一百个
    public static void main(String[] args) {
        for (int apple = 0; apple <=20 ; apple++) {
            for (int pear = 0; pear <=33 ; pear++) {
                for (int banana = 0; banana <=100 ; banana=banana+3) {
                    if (apple+pear+banana==100&&apple*5+pear*3+banana/3==100){
                        System.out.println(apple+"---"+pear+"---"+banana);
                    }
                }
            }
        }
    }
}

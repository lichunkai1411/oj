public class Demo31 {
    public static void main(String[] args) {
        int i=1;
        while (true){
            System.out.println(i+"次执行while循环");
            if (i==1000){
                break;
                // 达到条件时手动停止程序
            }
            i++;
        }
    }
}

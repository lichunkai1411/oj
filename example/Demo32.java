public class Demo32 {
    // 折叠问题
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.08;
        while (1==1){
            paper=paper*2;
            count=count+1;
            System.out.println("打印当前折叠次数"+count+"当前高度"+paper);
            if (paper>=8848000){
                break;
            }
        }
        System.out.println(count);
    }
}

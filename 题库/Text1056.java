public class Text1056 {
    // 找到能被2和3整除的数字
    public static void main(String[]args){
        for (int i = 21;i<40;i++) {
            // 如果对2取余等于0并且对3取余等于0
            if (i%2==0 && i%3==0) {
                System.out.println(i);
            }
        }
    }
}
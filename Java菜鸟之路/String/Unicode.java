package String;

public class Unicode {
    // TODO: 将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
    public static void main(String[] args) {
        int a = 72;
        int b = 105;
        int c = 65281;
        String s = " "+(char)a+(char)b+(char)c;
        System.out.println(s);
    }
}

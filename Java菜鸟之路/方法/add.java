package 方法;

public class add {
    public static void main(String[] args) {
        add(2,5,7);
    }
    public static int add(int a, int b, int c){
        int result = a + b + c;
        System.out.println("result: " + result);
        return result;
    }
}

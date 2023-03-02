package Lambda表达式;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：17:28
 * @author lck
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        use(new A() {
            @Override
            public void method() {
                System.out.println("匿名内部类...");
            }
        });
        use(() -> System.out.println("Lambda..."));
    }
    public static void use(A a){
        a.method();
    }
}
interface A{
    void method();
}
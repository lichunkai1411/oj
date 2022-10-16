package 内部类;

public class TestInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        System.out.println(inner.age);
    }
}

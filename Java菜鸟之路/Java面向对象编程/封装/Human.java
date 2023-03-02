package Java面向对象编程.封装;

public class Human {
    private int age;
    // 可以被本包下面的类访问
    String name;
    protected int height;

   public void seyAge() {
        System.out.println(age);
    }
}

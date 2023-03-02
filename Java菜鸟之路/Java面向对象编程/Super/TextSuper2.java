package Java面向对象编程.Super;

/**
 * @Author Lick
 * @date Created in 2022-11-06 15:11
 */
public class TextSuper2 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象……");
        new ChildClass2();
    }
}
class FatherClass2{
    public FatherClass2(){
        // 默认添加、无需手敲
        super();
        System.out.println("创建FatherClass");
    }
}
class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super();
        System.out.println("创建ChildClass");
    }
}

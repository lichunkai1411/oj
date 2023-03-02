package static关键字.tools;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：17:59
 * @author lck
 */
public class Test {
    /**
     *      1.成员方法什么时候加入 static
     *              -常用于制作工具类
     *      2.工具类：不是描述事物的，而是帮我们完成一些事情(打工)
     *      3.如果发现一个类中，所有的方法，全都是static所修饰
     *              -私有该类的构造方法
     *              -目的：为了不让其他类，再创建对象
     * @param args
     */
    public static void main(String[] args) {
        int []arr = {11,22,33};
        /*ArrayTools arrayTools = new ArrayTools();*/
        System.out.println(ArrayTools.getMax(arr));
        System.out.println(ArrayTools.getMin(arr));
        ArrayTools.printArray(arr);

    }
}

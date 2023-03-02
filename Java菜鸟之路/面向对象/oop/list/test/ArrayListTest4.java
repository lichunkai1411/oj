package 面向对象.oop.list.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-04
 * Time：18:30
 * @author lck
 */

import java.util.ArrayList;

/**
 *      需求：创建一个存储String的集合，内部存储(test，张三，李四，test，test)字符串
 *              删除所有的test字符串，删除后，将集合剩余元素打印在控制台
 *
 *      总结：在遍历集合的过程中，有删除操作
 *              1.正序遍历：不要忘记 -- 操作
 *              2.倒序遍历：不需要 -- 操作
 * @author lck
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        /**
         *  正着删
         */
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)){
                 list.remove(i);
                 i--;
            }
        }
        /**
         *  反着删
         */
        /*for (int i = list.size()-1; i >= 0; i--) {
            String s = list.get(i);
            if ("test".equals(s)){
                list.remove(i);
            }
        }*/
        System.out.println(list);
    }
}

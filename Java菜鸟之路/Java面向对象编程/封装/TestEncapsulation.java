package Java面向对象编程.封装;

import Java面向对象编程.封装.细节.TestPackaging;

/**
 * 测试封装
 * @Author Lick
 * @date Created in 2022-11-06 16:52
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        human.name="John";
        human.height= 180;


        TestPackaging testPackaging = new TestPackaging();
        testPackaging.setId(48);
        testPackaging.setName("John");
        testPackaging.setAge(200);
        testPackaging.setMan(true);

        System.out.println(testPackaging.getId());
        System.out.println(testPackaging.getName());
        System.out.println(testPackaging.getAge());
        System.out.println(testPackaging.isMan());
    }
}

class Boy extends Human{
    void seyHello() {
        // 拥有父类属性但是不可以使用父类私有的属性和方法
//        System.out.println(age);
    }
}

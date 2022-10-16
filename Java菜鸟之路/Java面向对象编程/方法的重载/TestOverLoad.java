package Java面向对象编程.方法的重载;

/**
 * 测试方法的重载
 */
public class TestOverLoad {
    public static void main(String[] args) {
        add();
        add(3);
        add(3,4);
        add(3.0);
        add(3.1,1);
        add(1,3.2);
    }
    static void add(){     // 形参个数不一样

    }
    static void add(int a){     // 形参个数不一样

    }
    // static void add(int b){      // 调用时无法区分

    // }
    static void add(int a, int b){      // 形参个数不一样

    }
    static void add(double a){      //形参类型不一样

    }
    static void add(int a,double b){      // 形参顺序不一样

    }
    static void add(double a,int b){        // 形参顺序不一样

    }
    /* static int add(int a,int b,int c) {     // 只有返回值类型不同不构成重载
    }                                          // 调用时无法区分
    static double add(int a,int b,int c){
    } */
}

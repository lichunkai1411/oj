package Java面向对象编程.构造方法的重载;

/**
 * 测试构造方法的重载
 */
public class User {
    int id;
    String name;
    String pwd;

    public User() {     // 重载了一个无参的构造器

    }

    public User(int id) {    // 重载了一个参数的构造器

        this.id = id;    // 对象的属性
    }

    public User(int id, String name) {     // 重载了两个参数的构造器
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String pwd) {     // 可以使用快捷方式创建构造器
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


    public static void main(String[] args) {
        User user = new User();
        User user1 = new User(1001);
        User user2 = new User(1002, "lick");
        User user3 = new User(1003, "lick", "123456");

    }
}

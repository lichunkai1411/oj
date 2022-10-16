package Java面向对象编程.Object类;

/**
 * @Author Lick
 * @date Created in 2022-10-07 11:17
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;
        User user = new User(1000, "高琪", "123456");
        User user2 = new User(1000, "李春凯", "123456");
        System.out.println(user == user2);
        System.out.println(user.equals(user2));
    }
}

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        User other = (User) obj;
        if (id!= other.id)
            return false;
        return true;
    }
}


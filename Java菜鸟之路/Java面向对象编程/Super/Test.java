package Java面向对象编程.Super;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setId(48);
        user.setName("李春凯");
        user.setMan(true);

        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.isMan());
    }
}

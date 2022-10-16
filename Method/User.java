public class User{
    int id;
    String name;
    String pwd;

    public User(){

    }
    public User(int id){
        this.id = id;
    }
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User user = new User();
        User user1 = new User(1002,"李春凯");
        User user2 = new User(1003,"高淇","12345678");
        User user3 = new User(1004);
    }
}
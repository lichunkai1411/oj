package 控制语句;

/**
 * 测试switch语句的使用
 */
public class TestSwitch01 {
    public static void main(String[] args) {
        int grade = (int) (Math.random() * 4) + 1;   // 大学的年级
        switch (grade) {
            case 1:
                System.out.println("大一！不要迷茫，好好学，差距就是在大一开始的！");
                break;
            case 2:
                System.out.println("大二！别玩游戏了，开始加油吧！");
                break;
            case 3:
                System.out.println("大三！真快呀！");
                break;
            default:
                System.out.println("大四！时间过的真快，马上要工作了！");
                break;
        }
    }
}

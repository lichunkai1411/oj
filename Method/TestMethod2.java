// TODO:定义一个方法处理公司的迟到问题。
public class TestMethod2 {
    public static int handleLate(int lateMinutes,int monthSalary) {
        int fakuan  = 0;
        int  daySalary = (int) (monthSalary/22.5);
        System.out.println("迟到几分钟："+lateMinutes);
        System.out.println("月薪："+monthSalary);

        if(lateMinutes<10){
            System.out.println("警告！");
        }else if(lateMinutes<=20){
            System.out.println("罚款100元");
            fakuan = 100;
        }else if(lateMinutes<=30){
            System.out.println("罚款200元");
            fakuan = 200;
        }else if(lateMinutes<=60){
            System.out.println("罚款半日工资");
            fakuan = daySalary/2;
        }else {
            System.out.println("扣除一日工资");
            fakuan = daySalary;
        }
        return fakuan;
    }

    public static void main(String[] args) {
        int a = handleLate(25,5000);
        int b = handleLate(15,8000);
        int c = handleLate(65,20000);
        System.out.println("今天公司罚款总数："+(a+b+c));
    }
}

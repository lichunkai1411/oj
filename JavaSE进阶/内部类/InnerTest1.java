package 内部类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：13:56
 * @author lck
 */
public class InnerTest1 {
    public static void main(String[] args) {
        MyOuter.MyInner myOI = new MyOuter().new MyInner();
        myOI.show();
    }
}
class MyOuter{
    int num =10;
    class MyInner{
        int num = 20;
        public void show(){
            int num = 30;
            MyInner myInner = new MyInner();
            MyOuter.MyInner myOI = new MyOuter().new MyInner();
            System.out.println(num); // 30
            System.out.println(this.num); // 20
            System.out.println(MyOuter.this.num); // 10
        }
    }
}
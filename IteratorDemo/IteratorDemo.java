import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(5);

        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i < 10) {
                iterator.remove();
            }
            System.out.println(num);
        }
    }
}

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<String>();
        students.add("Lily");
        students.add("Lucy");

        students.contains("Lily");
        students.remove("Lily");
        students.size();
        for (String name : students){
            System.out.println(name);
        }
        System.out.println(students);
        students.clear();
    }
}
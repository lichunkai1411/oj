import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores;
        studentScores = new HashMap<String, Integer>();

        studentScores.put("Lily", 98);
        studentScores.put("lucy", 88);

        studentScores.get("Lily");
        studentScores.remove("Lily");

        studentScores.size();

       /* for (String name : studentScores.keySet()) {
            System.out.println(studentScores.get(name));
        }
        for (Integer score : studentScores.values()) {
            System.out.println(score);
        }*/
        System.out.println(studentScores);
        studentScores.clear();
    }
}

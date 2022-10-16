package Day01;

public class Horse extends Animal implements Comparable {
    public Horse(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void shout() {
        System.out.println("Yuuuuuuu~~");
    }

    public void eat(String Grass) {
        System.out.println("Eat"+Grass);
    }
    public int compare(Horse horse){
        if (this.age>horse.age){
            return 1;
        }else if (this.age==horse.age){
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public int compare(Object object) {
        return 0;
    }
}

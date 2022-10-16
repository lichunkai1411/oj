package Day01;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void shout() {
        System.out.println("Miao miao miao!");
    }

    public void eat(String fish) {
        System.out.println("Miao~wu~");
    }
    public int compare(Cat cat){
        if (this.weight>cat.weight){
            return 1;
        }else if (this.weight==cat.weight){
            return 0;
        }else {
            return -1;
        }
    }
}

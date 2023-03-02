public class GenericDemo {
    public static <E> void printArray (E[] date){
        for (E element : date){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
       Integer [] numbers = {1,2,3,4,5};
       Character [] characters = {'a','b','c','d','e'};
       String [] words = {"I","LOVE","JAVA"};
       printArray(numbers);
       printArray(characters);
       printArray(words);
    }
}

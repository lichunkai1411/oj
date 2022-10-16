package com.itbaizhan;

public class Test01 {
    public static void main(String[] args) {
        int [] array = new int[10];// 声明并创建数组
        for (int i = 0; i < 10; i++) {// 动态初始化
            array[i] =2*i+1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        Man [] man = new Man[10];
        Man m1 = new Man(1,11);
        Man m2 = new Man(1,22);
        man[0] =m1;
        man[1] =m2;
        System.out.println(man[0].getId());
        System.out.println(man[0].getAge());
        System.out.println(man[1].getId());
        System.out.println(man[1].getAge());
    }
}
class Man{
    private int age;
    private int id;
    public Man(int age, int id){
        super();
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

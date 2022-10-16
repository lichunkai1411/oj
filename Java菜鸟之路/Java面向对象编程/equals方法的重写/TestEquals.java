package Java面向对象编程.equals方法的重写;

import java.util.Objects;

public class TestEquals extends Object {
    int id;
    String name;
    String pwd;

    public TestEquals(int id, String name, String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    TestEquals(){}

/*
    public String toString(){
        return "TestEquals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
*/

    public static void main(String[] args) {
       TestEquals testEquals = new TestEquals(1001,"lick","123456");
       TestEquals testEquals2 = new TestEquals(1001,"lick","123456");
        System.out.println(testEquals.toString());
        System.out.println(testEquals2.toString());
        System.out.println(testEquals.equals(testEquals2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEquals that = (TestEquals) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }
}

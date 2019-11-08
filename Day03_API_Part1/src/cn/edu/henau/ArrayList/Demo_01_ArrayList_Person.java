package cn.edu.henau.ArrayList;

/*
* 定义一个Person类
* */
public class Demo_01_ArrayList_Person {
    private String name;
    private int age;

    public Demo_01_ArrayList_Person() {
    }

    public Demo_01_ArrayList_Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo_01_ArrayList_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

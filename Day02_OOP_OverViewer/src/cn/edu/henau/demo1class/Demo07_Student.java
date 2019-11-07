package cn.edu.henau.demo1class;
/*
* 对于基本数据类型的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变
* */
public class Demo07_Student {
    private String name;
    private int age;
    private boolean male;//是不是男生

    @Override
    public String toString() {
        return "Demo07_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                '}';
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Demo07_Student() {

    }

    public Demo07_Student(String name, int age, boolean male) {

        this.name = name;
        this.age = age;
        this.male = male;
    }
}

package cn.edu.henau.Static;

/*
* 示范静态代码块的类
* */
public class Static_CodeBlock_Class {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Static_CodeBlock_Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Static_CodeBlock_Class() {
        System.out.println("Constructor method be executed!");
    }

    public Static_CodeBlock_Class(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor method be executed!");
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

    static{
        System.out.println("静态代码块被执行！");
    }
}

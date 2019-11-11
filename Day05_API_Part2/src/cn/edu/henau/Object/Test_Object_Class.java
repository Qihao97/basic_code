package cn.edu.henau.Object;

import java.util.Objects;

/*
* Object测试类
* */
public class Test_Object_Class {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Test_Object_Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Test_Object_Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
//        传入对象等于本身，返回true
        if (this == o) return true;
//        getClass() != o.getClass()，，使用反射技术，判断 o 是否是Test_Object_Class类型 等效于 obj instanceof Test_Object_Class
        if (o == null || getClass() != o.getClass()) return false;
//        向下强制转型：Object类型强制转换为 Test_Object_Class类型
        Test_Object_Class that = (Test_Object_Class) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public Test_Object_Class() {

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
}

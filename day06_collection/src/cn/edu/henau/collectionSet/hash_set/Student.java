package cn.edu.henau.collectionSet.hash_set;

import java.util.Objects;

/**
 * Author: Qihao
 * Date: 2019/11/23  20:57
 * Content:
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int num;

    public Student() {
    }

    public Student(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                num == student.num &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, num);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
    }

//    重写排序的规则
    @Override
    public int compareTo(Student o) {
//        return 0;  //返回0表示认为元素是相同的
//        下面自定义比较的规则,比较两个人的年龄
        return this.getAge() - o.getAge();    //按照年龄升序

    }
}

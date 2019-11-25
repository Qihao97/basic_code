package cn.edu.henau.collections_tool;

/**
 * Author: Qihao
 * Date: 2019/11/25  9:17
 * Content:
 */
public class StudentTest {
    private String name;
    private int age;

    public StudentTest() {
    }

    public StudentTest(String name, int age) {
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
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

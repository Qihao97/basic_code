package cn.edu.henau.demo1class;
/*
 * 定义一个学生类：
 * 成员变量：
 *   String name;
 *   int age;
 * 成员方法：成员方法不写static
 *   public void eat(){}
 *   public void sleep(){}
 *   public void study(){}
 *
 *   注意事项：
 *   1.成员变量是直接定义在类当中的，在方法外边
 *   2.成员方法不写static关键字
 * */
public class Demo01_Student {
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(){
        System.out.println("睡觉！");
    }

    public void study(){
        System.out.println("学习！");
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

    public Demo01_Student() {
    }

    public Demo01_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo01_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

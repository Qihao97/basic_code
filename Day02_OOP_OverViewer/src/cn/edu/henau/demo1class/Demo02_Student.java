package cn.edu.henau.demo1class;
/*
* 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
*
* 1.导包：支出需要使用的类在哪个位置。
*   格式：import 包名称.类名称
*   eg： import cn.henau.edu.demo1class.Demo01_Student;
*   对于和当前类属于同一个包的类，可以省略
*
* 2.创建：
*   格式：类名称 对象名 = new 类名称();
*   Student stu = new Student();
*
* 3.如何使用成员变量和方法
*   成员变量： 对象名.成员变量名
*   成员方法： 对象名.成员方法名(参数列表)
*
* 注意事项：
* 如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样
* */
public class Demo02_Student {
    public static void main(String[] args) {
        Demo01_Student stu = new Demo01_Student("张三" , 23);
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}

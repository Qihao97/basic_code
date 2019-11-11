package cn.edu.henau.Super;

/*
* 测试主方法：
*
* super关键字的用法有三种：
* 1.在子类的成员方法中，，访问父类的成员变量
* 2.在子类的成员方法中，访问父类的成员方法
* 3.在子类的构造方法中，访问父类的构造方法
* */
public class Demo_Super_Main {
    public static void main(String[] args) {
        Super_Son son = new Super_Son();
        System.out.println("-*--*--*--*--*--*--*--*-");
        Super_Son son1 = new Super_Son(109,208);

    }
}

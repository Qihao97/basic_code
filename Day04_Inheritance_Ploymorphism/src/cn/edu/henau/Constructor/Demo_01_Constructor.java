package cn.edu.henau.Constructor;

/*
* 继承关系中父子类构造方法的访问特点
*
* 1.子类构造函数中默认有一个隐含的super()调用，所以先调用父类构造，在调用子类的构造方法
* 2.子类构造可以通过super关键字来调用父类重载构造
* 3.super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
* 4.子类必须调用父类构造方法，不写则默认，写了按指定的super调用，super只能有一个，且必须是第一个
* */
public class Demo_01_Constructor {
    public static void main(String[] args) {
//        先执行父类的构造方法，再执行子类的构造方法
        Test_Son son = new Test_Son();

    }
}

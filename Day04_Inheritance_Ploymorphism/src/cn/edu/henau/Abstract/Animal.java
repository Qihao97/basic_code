package cn.edu.henau.Abstract;

/*
* 抽象方法：
*   加上abstract关键字，没有方法体，直接以分号结束
*
* 抽象类： 抽象方法所在的类，必须是抽象类。在class前添加abstract关键字即可
*
* 如何使用抽象类：
*   1.不能够直接创建抽象类的 对象
*   2.必须用一个子类来继承抽象父类
*   3.子类必须覆盖重写抽象父类中所有的抽象方法，即实现所有的抽象方法
* */
public abstract class Animal {
//    这是一个抽象方法，代表吃东西，没有具体实现
    public abstract void eat();

//    这是普通的成员方法
    public void normalMethod(){
        System.out.println("This is a normal method!");
    }
}

package cn.edu.henau.Abstract;

/*
* 抽象方法：
*   加上abstract关键字，没有方法体，直接以分号结束
*
* 抽象类： 抽象方法所在的类，必须是抽象类。在class前添加abstract关键字即可
* */
public abstract class Animal {
//    这是一个抽象方法，代表吃东西，没有具体实现
    public abstract void eat();

//    这是普通的成员方法
    public void normalMethod(){
        System.out.println("This is a normal method!");
    }
}

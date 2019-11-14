package cn.edu.henau.Inheritancde.This;

/*
* super关键字用以访问父类的内容，而this关键字用以访问本类的内容，用法也有三种：
* 1.在本类的成员方法中，访问本类的成员变量（典型用法）
* 2.在本类的成员方法中，访问本类的另一个成员方法
* 3.在本类的构造方法中，访问本类的另一个构造方法,
* 但是  this()必须是构造方法的第一句
*       this()和super()不能够同时存在于同一个构造方法中
* */
public class Demo_01_This {
    public static void main(String[] args) {
        This_Father_Class father = new This_Father_Class();
        father.printNum();
        System.out.println("-------------------------------");

        This_Son_Class son = new This_Son_Class();
        son.printNum();
        son.printFatherNum();
        System.out.println("-----------------------------");
        son.methodSon();
        System.out.println("------********************--------------");
        System.out.println("创建一个无参的子类：");
        This_Son_Class son1 = new This_Son_Class();
        System.out.println("创建一个含参的子类：");
        This_Son_Class son2 = new This_Son_Class(300);
    }
}

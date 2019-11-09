package cn.edu.henau.Static;

/*
* static修饰成员方法
* 使用static修饰成员方法，该方法即为静态方法，静态方法属于类
*
* 注意：
* 1.静态方法只能直接访问静态成员变量，不能直接访问非静态
*    在内存中先有的静态内容，后有的非静态内容
*2.静态方法中不能使用this关键字
*
* 区别：
* 没有static修饰的成员方法使用前要先创建对象再通过对象来调用
* 静态方法可以通过对象名调用，也可以通过类名来调用,推荐使用类名调用，用对象调用也会被javac翻译成 类名调用
* */
public class Demo_Static_Method {
    public static void print(){
        System.out.println("静态方法被调用！");
    }

    public void print1(){
        System.out.println("Method被调用！");
    }
}

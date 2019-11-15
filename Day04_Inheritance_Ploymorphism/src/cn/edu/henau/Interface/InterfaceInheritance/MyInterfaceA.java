package cn.edu.henau.Interface.InterfaceInheritance;

/*
* 使用接口时要注意：
* 1.接口是没有静态代码块或者构造方法的
* 2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
* 格式：
*   public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
*       //覆盖重写所有的抽象方法
*       ...
*   }
* */
public interface MyInterfaceA {
    public abstract void methodA();
}

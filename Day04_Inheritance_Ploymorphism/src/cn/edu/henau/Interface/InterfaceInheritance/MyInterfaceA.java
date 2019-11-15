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
* 3.如果实现类所实现的多个接口中，存在重复的抽象方法，那么只需要覆盖重写一次即可
* 4.如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类就必须是一个抽象类
* 5.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
* 6.优先级的问题，一个类，如果直接父类中的方法和接口中的默认方法冲突了，优先用父类当中的方法
*   在Java中，继承优先于接口实现
* */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodABS();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}

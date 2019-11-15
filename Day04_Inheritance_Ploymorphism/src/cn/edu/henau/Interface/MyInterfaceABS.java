package cn.edu.henau.Interface;

/*
* 在任何版本的java中，接口都能定义抽象方法
*   public abstract 返回值类型 方法名称(参数列表);
*
* 注意事项：
*   1.接口当中的抽象方法，修饰符需是两个固定的关键字： public abstract
*   2.这两个关键字修饰符，可以选择性地省略。
*   3.方法的三要素，可以根据业务随意定义
*
* 接口的使用步骤：
*   1.接口不能直接使用 ，必须有一个实现类，来实现接口，然后创建该类的对象来使用
*       格式：
*       public class 实现类名称 implements 接口名称{
*           ...
*       }
*   2.接口的实现类必须覆盖重写接口中所有的抽象方法（即实现接口中所有的抽象方法）
*   3.创建实现类的对象进行使用
* */
public interface MyInterfaceABS {
    public abstract void methodABS1();
    public abstract void methodABS2();
    public abstract void methodABS3();
    public abstract void methodABS4();

}

package cn.edu.henau.Interface.InterfaceInheritance.MoreInheritance;

/*
* 1.类与类之间是单继承的。直接父类只有一个
* 2.类与接口之间是多实现的。一个类可以实现多个接口
* 3.接口与接口之间是多继承的
*
* 注意事项：
*   1.多个父接口当中的抽象方法如果重复，没关系
*   2.多个父接口当中的默认方法如果重复，那么子接口必须重写默认方法，而且要带着default关键字
* */
public class More_Inheritance {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.methodDefault();
    }
}

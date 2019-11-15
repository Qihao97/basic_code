package cn.edu.henau.Interface.Static;

/*
* 注意：不能通过接口实现类的对象来调用接口当中的 静态方法。
* 正确用法; 通过接口名称直接调用接口中 的静态方法
* 格式：
*   接口名称.静态方法名称(参数列表)；
* */
public class Main {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        MyInterfaceStatic.methodStatic();
    }
}

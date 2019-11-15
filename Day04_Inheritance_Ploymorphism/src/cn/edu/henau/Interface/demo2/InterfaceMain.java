package cn.edu.henau.Interface.demo2;

/*
* 主方法
*
* 1.接口的默认方法，可以通过接口的实现类对象直接调用
* 2.接口的默认方法，也可以被接口实现类进行覆盖重写
*
* */
public class InterfaceMain {
    public static void main(String[] args) {
//        创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
//        调用抽象方法，实际运行的是右侧的实现类
        a.methodAbs();

//        调用默认方法，如果实现类中没有，会向上找接口
        a.methodNew();

        System.out.println("--------*********---------");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodNew();
    }
}

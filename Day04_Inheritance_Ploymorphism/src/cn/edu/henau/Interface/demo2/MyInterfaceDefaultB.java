package cn.edu.henau.Interface.demo2;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodNew() {
        System.out.println("接口B覆盖重写了接口的默认方法");
    }
}

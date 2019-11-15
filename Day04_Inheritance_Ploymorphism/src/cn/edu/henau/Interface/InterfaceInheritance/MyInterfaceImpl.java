package cn.edu.henau.Interface.InterfaceInheritance;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("methodA!");
    }

    @Override
    public void methodB() {
        System.out.println("methodB!");
    }
}

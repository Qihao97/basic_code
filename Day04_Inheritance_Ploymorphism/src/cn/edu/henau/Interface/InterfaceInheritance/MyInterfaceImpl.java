package cn.edu.henau.Interface.InterfaceInheritance;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("methodA!");
    }

    @Override
    public void methodABS() {
        System.out.println("覆盖重写了A、B都有的抽象方法!");
    }

    @Override
    public void methodDefault() {
        System.out.println("对接口中冲突的默认方法进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("methodB!");
    }
}

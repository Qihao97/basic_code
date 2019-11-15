package cn.edu.henau.Interface.InterfaceInheritance.MoreInheritance;

/*
* 这个子接口有4个方法
*   methodA来自接口A
*   methodB来自接口B
*   methodCommon，同时来自于接口A和B
*   method，来自自己
* */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();


    @Override
    default void methodDefault() {
        System.out.println("重写父接口A和B中的默认方法。");
    }
}

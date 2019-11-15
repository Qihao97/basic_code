package cn.edu.henau.Interface.InterfaceInheritance.Extends_Implements;

public interface MyInterfaceC {
    public default void method(){
        System.out.println("method from Interface!");
    }
}

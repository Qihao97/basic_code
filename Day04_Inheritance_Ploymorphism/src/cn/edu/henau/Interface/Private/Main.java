package cn.edu.henau.Interface.Private;

public class Main {
    public static void main(String[] args) {
        MyInterfacePrivateAImpl impl = new MyInterfacePrivateAImpl();
        impl.methodDefault1();
        System.out.println("---------------");
        MyInterfacePrivateA.methodCommon1();
        System.out.println("---------------");
        MyInterfacePrivateA.methodStatic1();
        MyInterfacePrivateA.methodStatic2();
    }
}

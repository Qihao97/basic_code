package cn.edu.henau.Interface.InterfaceInheritance;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.methodA();
        myInterface.methodB();
        System.out.println("------------------------------");
        myInterface.methodABS();
        System.out.println("------------------------------");
        myInterface.methodDefault();
    }
}

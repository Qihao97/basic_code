package cn.edu.henau.Inheritancde.Override;

/*
* 派生类：
* */
public class Demo_Override_DeriveClass extends Demo_Override_BasicClass{
    int num = 20;

    @Override
    public void method(){
        System.out.println("The derive class's method be executed!");
    }

    public Demo_Override_DeriveClass() {
        System.out.println("The derive class be established!");
    }

    public Demo_Override_DeriveClass(int num) {
        this.num = num;
        System.out.println("The derive class be established!");
    }
}

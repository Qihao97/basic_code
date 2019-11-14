package cn.edu.henau.Inheritancde.Override;

/*
* 基类
* */
public class Demo_Override_BasicClass {
    int num = 10;

    public void method(){
        System.out.println("The basic class's method be executed!");
    }

    public Demo_Override_BasicClass(int num) {
        this.num = num;
        System.out.println("The basic class be established!");
    }

    public Demo_Override_BasicClass() {
        System.out.println("The basic class be established!");
    }
}

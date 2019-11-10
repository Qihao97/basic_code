package cn.edu.henau.Inheritance;

/*
* 继承概述
*
* 类的设计原则：
* 1.对于已经投入使用的类，尽量不要进行修改
* 2.推荐定义一个新的类，来重复利用其中的共性内容，并且添加改动新内容
*
* */
public class Demo_01_Inheritance {
    public static void main(String[] args) {
        Test_Phone ph = new Test_Phone();
        ph.call();
        ph.send();
        ph.show();

        System.out.println("------------------");
        Test_New_Phone new_phone = new Test_New_Phone();
        new_phone.call();
        new_phone.send();
        new_phone.show();
    }
}

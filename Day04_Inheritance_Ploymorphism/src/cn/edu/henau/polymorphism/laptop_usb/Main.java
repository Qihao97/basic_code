package cn.edu.henau.polymorphism.laptop_usb;

/**
 * Created by Qihao on 2019/11/16 10:56
 *
 * 需求分析：
 *     进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
 *      1.USB接口，包含打开设备功能、关闭设备功能
 *      2.笔记本类，包含开机功能、关机功能、使用USB设备功能
 *      3.鼠标类，要实现USB接口，并具备点击的方法
 *      4.键盘类，要实现USB接口，具备敲击的方法
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

//        使用USB设备
//        准备一个鼠标,供笔记本电脑使用,使用多态创建方法，向上转型
        USB mouse = new Mouse();
//        参数是USB类型的，传入USB类型的鼠标对象
        laptop.useDevice(mouse);

//        创建一个USB键盘，使用正常的写法
        System.out.println("----------华丽的分割线----------");
        Keyboard keyboard = new Keyboard();
//        下方是正确的写法，此处发生了向上转型
        laptop.useDevice(keyboard);
//        使用子类对象，或者匿名对象都可以
        System.out.println("----------华丽的分割线----------");
        laptop.useDevice(new Keyboard());

        System.out.println("----------华丽的分割线----------");
        method(100.0);
        method(200);
        int a = 9000;       //int向上转double
        method(a);

        laptop.powerOff();
    }

    public static void method(double num){
        System.out.println(num);
    }
}

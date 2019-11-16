package cn.edu.henau.polymorphism.laptop_usb;

/**
 * Created by Qihao on 2019/11/16 11:05
 * 键盘是一个USB设备
 */
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘,键盘已可以工作!");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘，键盘已可以拔出!");
    }

    public void type(){
        System.out.println("键盘输入!");
    }
}

package cn.edu.henau.polymorphism.laptop_usb;

/**
 * Created by Qihao on 2019/11/16 11:10
 * 鼠标是一个USB设备
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标已打开，可以开始工作!");
    }

    @Override
    public void close() {
        System.out.println("鼠标已关闭，可以拔出!");
    }

    public void click(){
        System.out.println("点击鼠标!");
    }
}

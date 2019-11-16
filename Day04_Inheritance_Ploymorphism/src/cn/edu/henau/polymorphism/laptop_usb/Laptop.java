package cn.edu.henau.polymorphism.laptop_usb;

/**
 * Created by Qihao on 2019/11/16 11:07
 */
public class Laptop {
    public void powerOn(){
        System.out.println("笔记本电脑已开机!");
    }

    public void powerOff(){
        System.out.println("笔记本电脑已关机!");
    }

//    使用USB设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();     //打开设备

//        先判断usb类型，再向下转型
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
//        先判断usb类型，再向下转型
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }

        usb.close();   //关闭设备
    }
}

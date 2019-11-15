package cn.edu.henau.Interface.demo1;

/*
*  接口就是多个类的公共规范
*  接口是一种引用数据类型，最重要的内容就是其中的抽象方法
*
*  定义一个接口的格式：
*   public interface 接口名称{
*       //接口的内容
*   }
*
*   换成了关键字interface后，编译生成的字节码文件仍然是： .java --> .class
*
*   接口中可以包含的 内容有：
*       1.常量
*       2.抽象方法
*       -----------
*       3.默认方法
*       4.静态方法
*       -----------
*       5.私有方法
*
*  注意事项：
*      如果实现类没有覆盖重写接口中所有的抽象方法，那么该实现类必须是抽象类
* */
public class Demo_01_Interface {
    public static void main(String[] args) {
        MyInterfaceABSImpl impl = new MyInterfaceABSImpl();
        impl.methodABS1();
        impl.methodABS2();
        impl.methodABS3();
        impl.methodABS4();
    }
}

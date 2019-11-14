package cn.edu.henau.StringBuilder;

/*
* StringBuilder概述
* 字符串是常量，其值在创建后不能更改。
* 字符串缓冲区支持可变的字符串，因为String对象是不可变的，所以可以共享
*
* 字符串的底层是一个被final修饰的字节数组，是常量，不可改变
*   private final byte[] value;
* 当进行字符串相加时，内存中就会有多个字符串，占用空间多，效率低下
*
* StringBuilder，字符串缓冲区，可以提高字符串的效率，可看做是一个长度可以变化的字符串
* 其底层也是一个数组，但是没有被final修饰，可以改变长度,初始16个字节
*   byte[] value = new byte[16]
*   StringBuilder在内存中始终是一个数组，如果超出了StringBuilder的容量，会自动扩容
*
*   StringBuilder常用的构造方法有空参数的构造和带字符串的构造方法两种
*
*   StringBuilder常用的成员方法有两个，append方法和toString方法
*       1.将指定的字符串附加到此字符序列。可以添加任意类型的字符串形式，并返回当前对象本身
*        如果str是null ，则附加四个字符"null"
 *       public StringBuilder append(Stirng str);
*
* */
public class Demo_01_StringBuilder {
    public static void main(String[] args) {
//        空参数的构造方法
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:  " + sb1);
//        带字符串的构造方法
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2:  " + sb2);

        System.out.println("****************************************");
        StringBuilder sb3 = new StringBuilder();
        System.out.println("添加数据之前的sb3： " + sb3);
//        使用append方法，往sb3中添加数据
//        append方法返回的是this，即调用方法的对象，因此调用append方法无需接收返回值
        sb3.append("hello!");
        System.out.println("添加数据之后的sb3：  " + sb3);

        System.out.println("*******************************\n 链式编程：");
        String str = null;
        sb3.append("World!").append(123).append(true).append(1.23d).append(1233423137849739l).append('民').append(str);
        System.out.println("一顿操作猛如虎，此时sb3是：： " + sb3);
    }
}

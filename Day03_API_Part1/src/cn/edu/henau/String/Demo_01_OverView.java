package cn.edu.henau.String;

/*
* java.lang.String类代表字符串
* Java程序中的多有字符串字面值（如"abc"）,都作为此类对的实例实现
* 即程序中所有用双引号引起来的字符串都是String类的对象，没有new也是
*
* 字符串的特点：
* 1.字符串是常量，字符串的内容永不可变；
* 2.字符串不可改变，所以字符串是可以共享使用的；
* 3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组
*
* 创建字符串的3 + 1中方式：
*   三种构造方法：
*   public String():创建一个空白字符串，不含任何内容
*   public String(char[] array):根据字符数组的内容，来创建对应的字符串；
*   public String(byte[] array):根据字节数组的内容，来创建对应的字符串
*   一种直接创建：
*
* 注意：直接写上双引号，就是字符串对象，不管有么有new
* */
public class Demo_01_OverView {
    public static void main(String[] args) {
//        使用空参构造：
        String str1 = new String();
        System.out.println("NO.1: " + str1);

//        根据字符数组创建字符串：
        char[] charArray = {'a','b','c','d','e','f','g'};
        String str2 = new String(charArray);
        System.out.println("NO.2: " + str2);

//        根据字节数组来创建字符串
        byte[] byteArray = {97,98,99,100,101,102,103,104};
        String str3 = new String(byteArray);
        System.out.println("NO.3: " + str3);

//        直接创建
        String str4 = "Hello!";
        System.out.println("NO.4: " + str4);
    }
}

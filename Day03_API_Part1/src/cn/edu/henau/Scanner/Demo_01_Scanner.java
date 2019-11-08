package cn.edu.henau.Scanner;
import java.util.Scanner;
/*
* Scanner类的功能：可以实现键盘输入数据到程序中
*
* java.lang包下的内容不需要导包，其他的包都需要使用import语句导入
*
* 获取键盘输入的一个int数字，使用Scanner对象的nextInt方法
* 获取键盘输入的一个字符串：使用Scanner对象的next方法
*
* 键盘输入的都是字符串，next方法就是把这个字符串原封不动的拿过来，
* nextInt就是把输入的字符串转换为int数字作为返回值
* */
public class Demo_01_Scanner {
    public static void main(String[] args) {
//        System.in表示从键盘输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个int数字:");
        int num = sc.nextInt();
        System.out.println("输入一个String字符串:");
        String str = sc.next();

//        键盘输入两个int数字，并且求和
        System.out.println("请输入两个int数字:");
        int a = sc.nextInt(),b = sc.nextInt();
        int c = a + b;
        System.out.println("这两个数字对的和是: " + c);
    }
}

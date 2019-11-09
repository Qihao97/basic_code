package cn.edu.henau.Static;

//静态代码块
/*
* 静态代码块的格式是：
* public class 类名{
*     static{
*     //静态代码块内容
*     }
* }
* 特点：当第一次用到本类时，静态代码块执行唯一的一次。
*
* 静态内容总是优先于非静态，静态代码块优先于构造方法
*
* 静态代码块的用途：
* 常用来一次性地对静态成员变量进行赋值
* */
public class Demo_03_Static_CodeBlock {
    public static void main(String[] args) {
        Static_CodeBlock_Class staticCode = new Static_CodeBlock_Class("Jack",12);
        System.out.println(staticCode.toString());
        Static_CodeBlock_Class st = new Static_CodeBlock_Class("Black",23);
        System.out.println(st.toString());
    }
}

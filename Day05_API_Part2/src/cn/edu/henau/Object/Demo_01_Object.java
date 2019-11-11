package cn.edu.henau.Object;

/*
* java.lang.Object类概述：
* 类Object是类层次结构的根类。
* 每个类都使用Object作为超（父）类。所有对象（包括数组）都实现这个类的方法
*
* 所有的类都可以使用Object中的方法
* toString：返回一个字符串
* equals：指示一些其他对象是否等于此对象
* public boolean equals(Object obj){
*     return (this == obj);
* }
* 参数可以传入任意的对象，返回一个布尔值
* 1.基本数据类型：比较的是值；
* 2.引用数据类型：比较的是两个对象的地址值
* */
public class Demo_01_Object {
    public static void main(String[] args) {
        Test_Object_Class person = new Test_Object_Class("Jack",23);
        System.out.println("------------------");

//        直接打印对象的地址值通常没有什么意义，需要重写Object类中的toString方法
        System.out.println(person.toString());
        System.out.println(person);

        System.out.println("-----------------------");
        Test_Object_Class p1 = new Test_Object_Class("Marry", 12);
        Test_Object_Class p2 = new Test_Object_Class("Jane", 14);

        System.out.println("p1:  " + p1);
        System.out.println("p2:  " + p2);

        System.out.println(p1.equals(p2));
        System.out.println("************************************");
        p1 = p2;
        System.out.println(p1.equals(p2));
    }
}

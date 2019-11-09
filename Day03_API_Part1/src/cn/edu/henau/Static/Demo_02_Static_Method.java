package cn.edu.henau.Static;

/*
* 对于本类当中的静态方法，可以省略类名称
*根据类名访问静态成员变量的时候，是去方法区的静态区找该静态变量，全程和对象无关，只和类有关系
* * */
public class Demo_02_Static_Method {
    public static void main(String[] args) {
        Demo_Static_Method d1 = new Demo_Static_Method();
        d1.print1();
        d1.print();
        Demo_Static_Method.print();

        myMethod();
    }

    public static void myMethod(){
        System.out.println("本类的静态方法！");
    }
}

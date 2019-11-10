package cn.edu.henau.Math;

/*
* java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作
*
* 1.求绝对值：
*   public static double abs(double num)
* 2.向上取整：
*   public static double ceil(double num)
* 3.向下取整:
*   public static double floor(double num)
* 4.四舍五入：
*   public static long round(double num)
*
*   Math.PI代表近似的圆周率，double值
* */
public class Demo_01_Math {
    public static void main(String[] args) {
        double d = 3.1415926;
        System.out.println(Math.abs(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));

        System.out.println(Math.PI);
    }
}

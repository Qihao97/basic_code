package cn.edu.henau.WrapperClass;

/*
*   基本类型与字符串之间的相互转换
*   基本类型 --> 字符串
*       1. 基本类型的值 + ""(空字符串)
*       2.使用包装类的静态方法 toString（参数），不是Object类的toString（），重载
*       3.String类的静态方法 valueOf(参数)
*           static String valueOf(int i) 返回int参数的字符串表示形式
*   String  --> 基本类型
*       1.使用包装类的静态方法parseXXX（"数值类型的字符串")
*           Integer类： static int parseInt(String s)
*           Double类：  static double parseDouble(Stirng s)
* */
public class Demo_03_String {
    public static void main(String[] args) {
//        基本类型 --> 字符串
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

//         String  --> 基本类型
        int i2 = Integer.parseInt(s1);
        System.out.println(i2 - 10);
    }
}

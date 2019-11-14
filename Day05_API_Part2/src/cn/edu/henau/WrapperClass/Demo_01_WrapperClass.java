package cn.edu.henau.WrapperClass;

/*
* 包装类概述：
*     基本数据类型使用起来非常方便，但是其中缺乏相应的方法来操作数据，
*     使用包装类，把基本的数据类型封装起来，在类中定义一些方法来操作这些基本数据类型
*     基本      封装
*     int       Integer
*     char      Character
*     boolean   Boolean
*     float     Float
*     double    Double
*     long      Long
*     short     Short
*     byte      Byte
*
*  装箱与拆箱：
*      装箱：从基本类型转换为对应的包装类对象
*      拆箱：从包装类对象转换为基本类型
*
* */
public class Demo_01_WrapperClass {
    public static void main(String[] args) {
//        装箱和拆箱示例
//        装箱，使用构造方法，Integer(int value),Integer(String s)
        Integer i = new Integer(1);
        System.out.println(i);

        Integer strInt = new Integer("1");
        System.out.println(strInt);

//        使用静态方法装箱
        Integer i2 = Integer.valueOf(123);
        Integer i3 = Integer.valueOf("123");//此方式字符串内容需是数字，否则报2数字格式错误
        System.out.println("i2:  " + i2);
        System.out.println("i3:  " + i3);

//        拆箱：int intValue()  以int类型返回该Integer的值。
        int iii = i2.intValue();
        System.out.println(iii);
    }
}

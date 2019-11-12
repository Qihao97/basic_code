package cn.edu.henau.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的成员方法
*
* 成员方法的参数：
*   int field: 日历类的字段，可以使用Calendar类的静态成语言变量获取
*   YEAR,MONTH,DATE,DAY_OF_MONTH,HOUR,MINUTE,SECOND
*
* */
public class Demo_02_Calendar_Method {
    public static void main(String[] args) {
        demo01();
    }

    /*
    * public int get(int field):
    * 返回给定日历字段的值。
    * 参数：传递指定的日历字段（YEAR，MONTH……）
    * 返回值： 日历字段代表的具体的值
    *
    * 将给定的日历字段设置为给定值
    *
    * int amount :增加/减少指定的值
    *   正数增加，负数减少
    *
    *   getTime()返回日期
    * */
    private static void demo01() {
//        使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println("YEAR is:" + year);

        //西方的月份是0到11，
        int month = c.get(Calendar.MONTH);
        System.out.println("month is :  " + month);

        //月中的某一天 DATE || DAY_OF_MONTH
        int d = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("DAY_OF_MONTH is:  " + d);
        int d2 = c.get(Calendar.DATE);
        System.out.println("DATE is:  " + d2);

//        设置年为9999
        c.set(Calendar.YEAR,9999);
        System.out.println("----------------------");
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2);

//        设置为9月
        c.set(Calendar.MONTH,9);
        System.out.println("**********************");
        int month2 = c.get(Calendar.MONTH);
        System.out.println(month2);

//        同时设置年月日，可以使用set
        c.set(6666,6,6);
        System.out.println(c);

//        增加年
        c.add(Calendar.YEAR,2);

//        减少月
        c.add(Calendar.MONTH,-3);

        Date ddd = c.getTime();
        System.out.println(ddd);
    }
}

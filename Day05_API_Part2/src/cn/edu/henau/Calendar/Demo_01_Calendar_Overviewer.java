package cn.edu.henau.Calendar;

import sun.util.resources.ar.CalendarData_ar;

import java.util.Calendar;

/*
* Calendar类的概述
* Calendar类是一个抽象类，
*
* Calendar类的静态方法 getInstance（），该方法返回了Calendar类的子类对象，使用默认时区和语言环境获得一个日历
*
* 1.返回给定日历字段的值
*   public int get(int field)
*
*   int field: 日历类的字段，可以使用Calendar类的静态成员变量获取
* 直接已知子类：
* GregorianCalendar
* */
public class Demo_01_Calendar_Overviewer {
    public static void main(String[] args) {
//        多态
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}

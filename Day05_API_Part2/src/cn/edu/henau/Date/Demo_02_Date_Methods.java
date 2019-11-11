package cn.edu.henau.Date;

import java.util.Date;

/*
* Date类的空参构造方法
* Date() 获取当前系统的日期和时间
* Date(long date):传递毫秒值，将毫秒转换为Date日期
* */
public class Demo_02_Date_Methods {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(0);
        System.out.println(date1);

        System.out.println("---------------------");
        System.out.println(date.getTime());
        System.out.println("---------------------");
        Date date2 = new Date(157347306478L);
        System.out.println(date2);
    }
}

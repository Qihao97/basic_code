package cn.edu.henau.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 计算一个人已经出生了多少天
*
* 1.使用Scanner方法获取出生日期
* 2.使用DateFormat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期
* 3.把Date格式的出生日期转换为毫秒值
* 4.获取当前的日期，转换为毫秒值
* 5.将当前毫秒值减去出生日期的毫秒值，并换算成天
*
* */
public class Demo_04_Practise {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birthday: The format is yyyy-MM-dd");
        String birthday = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);
        long time = birthdayDate.getTime();
        long now = new Date().getTime();
        long days = now - time;
        System.out.println("The days is :" + days / 86400000);
    }
}

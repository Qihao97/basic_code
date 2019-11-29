package cn.edu.henau.chapter1_abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Qihao
 * Date: 2019/11/27  8:41
 * Content:
 * 异常: 指的是程序在执行过程中,出现的非正常的情况,最终会导致JVM的非正常终止
 * 在Java等面向对象的编程语言中,异常本身是一个类,产生异常就是创建异常的对象,并且抛出一个异常对象,Java处理异常的方式是中断处理
 * 异常不是语法错误,语法错误在编译时报错
 *
 * 异常的体系: 异常的根类是Throwable,其下有两个子类 Error和 Exception,
 *           Error是严重的错误,无法通过处理,只能事先避免
 *           Exception:表示异常,可以通过代码来纠正,使程序继续运行
 *
 * 平常说的异常指的是Exception,此类异常一旦出现,就要对代码进行更正,修复程序
 * 异常的分类:
 *        1.编译时期的异常:checked异常,(如 日期格式化异常)
 *        2.运行时期的异常:runtime异常(如 数学异常)
 *
 * Error和Exception的区别
 */
public class Demo01_AbnormalOverview {
    public static void main(String[] args) {
//        Exception:编译时期的异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        /**
         * 写一段代码来处理异常,处理完异常后,程序可以继续执行
         * */
        try {
            Date date = sdf.parse("2019-10-28");  //把字符串格式的日期,解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        可以将异常交给虚拟机处理,虚拟机处理方式就是中断,然后打印异常
//        第二种方式是使用try catch方式来处理异常

//      运行时期的异常
        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[0]);
        try{
//            try里面放的是可能会出现异常的代码
            System.out.println(arr[10]);
        }catch(Exception e){
//            catch里面放的是异常的处理逻辑,即,出现异常后,如何处理的问题
            System.out.println(e);
        }
        System.out.println("上述数组的索引越界异常已经处理");

        /**
         * Error: 错误
         * OutOfMemoryError: Java heap space
         * 内存溢出错误,创建的数组太大了,超出了给JVM分配的内存使用范围,错误必须要修改代码,才能解决
         * */
        int[] arrInt = new int[1024*1024*1024*1024*1024*1024*1024];
    }
}

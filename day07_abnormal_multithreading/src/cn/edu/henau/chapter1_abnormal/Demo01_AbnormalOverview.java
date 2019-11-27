package cn.edu.henau.chapter1_abnormal;

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

    }
}

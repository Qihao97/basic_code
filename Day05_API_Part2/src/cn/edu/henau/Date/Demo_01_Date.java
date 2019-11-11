package cn.edu.henau.Date;

/*
* java.util.Date类，表示日期和时间的类
* 表示特定的瞬间，精确到毫秒
*
* 毫秒值的作用：可以对日期和时间进行计算
* 可将日期起转换为毫秒值进行计算，计算完毕，再把毫秒转换为日期
*
* 把日期转换为毫秒：
*   时间原点:1970年1月1日 00:00:00（英国格林威治）
*   就是计算当前日期到时间原点之间一共经历了多少毫秒，返回值是long类型
*   因为中国位于东八区，故而会将时间增加八个小时
*
*   毫秒转换为日期：
*   1D = 24H = 24 * 60 * 60 s = 86400 * 1000 ms
* */
public class Demo_01_Date {
    public static void main(String[] args) {
//        当前瞬间到时间原点一共经历了多少毫秒
        System.out.println(System.currentTimeMillis());
    }
}

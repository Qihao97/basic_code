package cn.edu.henau.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* DateFormat 是日期/时间格式化子类的抽象类
* 直接已知子类：
*   DateFormat，MessageFormat，NumberFormat
*
* 作用：
*     格式化（即：日期 -> 文本）、解析（文本 -> 日期）
* 成员方法：
*     String format(Date date)
*     按照指定的模式，把Date日期，格式化为符合模式的字符串
*     Date parse （String source） 把符合模式的字符串，解析为Date日期
*
*     DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类来创建对象
*     java.text.SimpleDateFormat extends DateFormat
*
*     构造方法：
*       SimpleDateFormat（String pattern)
*       用给定的模式和默认语言环境的日期格式符号构造  SimpleDateFormat。
*       参数：
*       String pattern：传递指定的模式，区分大小写
*       y   年
*       M   月
*       d   日
*       H   时
*       m   分
*       s   秒
*       写对应的模式，将模式替换为对应的日期和时间
*           eg: "yyyy-MM-dd HH:mm:ss"
*       注意事项：
*           模式中的字母不可更改，但是连接模式的符号可以改变
* */
public class Demo_03_DateFormat {
    public static void main(String[] args) throws ParseException {

/*
*   使用DateFormat类中的方法format，把日期格式化为文本
*   使用步骤：
*       1.创建SimpleDateFormat对象，构造方法中传递指定的模式，即时间显示格式
*       2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式
*         把Date日期格式化为符合模式的字符串（文本）
* */
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        Date date1 = new Date();
        String format = date.format(date1);
        System.out.println(format);

        /*
        * 解析的方法：
        * DateFormat类中的方法parse，把文本解析为日期
        * 使用步骤：
        *   1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        *   2.调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为日期
        * */
        System.out.println("\\-------------------\\\\\\");
        SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String format1 = "2019-3-4  21:21:21";
        Date da = date2.parse(format1);
        System.out.println(da);


    }
}

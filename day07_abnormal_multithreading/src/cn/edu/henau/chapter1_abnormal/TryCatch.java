package cn.edu.henau.chapter1_abnormal;

import java.io.IOException;

/**
 * Author: Qihao
 * Date: 2019/11/29  16:21
 * Content:
 * 使用try...catch来捕获异常
 * 异常处理的第二种方式,自己来处理异常
 * 格式:
 *     try{
 *         可能产生异常的代码
 *     }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *         异常的处理逻辑,产生异常对象之后,怎么处理异常对象
 *         一般,在工作中,会把异常的信息记录到一个日志中
 *     }
 *     ...
 *     catch(异常类名 变量名){
 *
 *     }
 *
 *  注意:
 *      1. try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
 *      2. 如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
 *          如果try中没有产生异常,那么就不会执行catch中的异常处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 *      3.try...catch 和 throws的区别,try...catch
 */
public class TryCatch {
    public static void main(String[] args)  {
        /*readFile("r.txt");
        readFile("t.abc");*/

        try{
            readFile("iii.tx");
        }catch (IOException e){
//            一般来说,try中抛出什么异常对象,catch就定义什么异常变量,用来接收这个异常对象
//            System.out.println("传递的文件后缀不是.txt");
/**
            Throwable 中定义了三个异常处理的方法
             1. String getMessage()  返回此 throwable 的详细消息字符串
             2. String toString()  返回此throwable 的详细消息字符串
             3. void printStackTrace()  JVM 打印异常对象,默认此方法,异常信息最全面
            */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("try...catch 之后的代码!");
    }


    /**
     * 如果传递的路径不是 .txt结尾,就抛出IO异常,
     * 告知方法的调用者,文件的后缀名不正确
     * */
    public static void readFile(String fileName) throws IOException{
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不正确!");
        }
        System.out.println("文件的后缀名没有文件,读取文件!");
    }

}

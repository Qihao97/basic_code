package cn.edu.henau.chapter1_abnormal;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author: Qihao
 * Date: 2019/11/29  13:10
 * Content:
 * 声明异常的关键字 throws
 * 是异常处理的第一种方式,,交给别人处理
 * 作用: 当方法内部抛出异常对象的时候,我们就必须处理异常对象
 *      可以使用throws关键字处理异常对象,会把异常对象声明抛出给方法的调用者处理
 *      (自己不处理,交给别人处理),,最终交给JVM来处理,,-->中断处理
 * 使用格式: 在方法声明时使用
 *      修饰符  返回值类型  方法名(参数列表) throws{
 *          throw new AAAException("产生的原因");
 *          throw new BBBException("产生原因");
 *          ...
 *      }
 *
 * 注意事项:
 *      1. throws关键字必须写在方法声明处
 *      2. throws关键字后面声明的对象必须是Exception或者Exception的子类
 *      3. 方法内部如果抛出了多个异常,那么throws后边必须也声明多个异常
 *         如果抛出的多个异常有子父类关系,那么,直接声明父类异常即可
 *      4. 调用了一个声明抛出异常的方法,我们就必须处理声明的异常
 *         要么继续使用throws声明抛出,交给方法的调用者处理,最终交给JVM处理
 *         要么try...catch自己处理异常
 *      5.
 */
public class DeclareExceptionThrows {

    public static void main(String[] args) throws IOException {
        readFile("C:\\a.txt");
    }

    /**
     * 定义一个方法,对传递的问津路径进行合法性的判断
     * 如果路径不是"C:\\a.txt",那么我们就抛出文件找不到异常对象,告知方法的调用者
     *  FileNotFoundException是编译异常,抛出该异常,就要给予处理
     *  可以使用throws继续声明抛出FileNotFoundException这个异常对象,让方法的调用者处理
     *
     * */
    public static void readFile(String fileName) throws IOException {
        if (fileName.equals("C:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是C:\\a.txt");
        }
        /**
         * 如果传递的路径,不是 .txt 结尾
         * 那么我们就抛出IO异常对象,告知方法的调用者,文件的后缀名不对
         * */
        if (fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
    }

}

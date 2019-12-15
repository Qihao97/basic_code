package cn.edu.henau.chapter1_abnormal;

/**
 * Author: Qihao
 * Date: 2019/12/13  17:34
 * Content:
 * 自定义的异常类:
 *     java提供的异常类,不够我们使用,需要自己定义一些异常类
 *
 * 格式:
 *    public class XXXException extends Exception/RuntimeException{
 *        添加一个空参数的构造方法
 *        添加一个带有异常信息的构造方法
 *    }
 *
 * 注意事项:
 *     1. 自定义的异常类,一般都是以Exception结尾,说明该类是一个异常类
 *     2. 自定义的异常类,必须继承Exception,或者是RuntimeException
 *          继承自Exception: 那么自定义的异常类就是一个编译期异常,如果方法内部抛出了编译期异常,就必须处理该异常,要么throws,要么try...catch
 *          继承自RuntimeException: 那么自定义的异常类,就是一个运行期间的异常,无需处理可以交个JVM来中断处理
 */
public class Demo14RegisterException  extends Exception{
    //添加一个空参数的构造方法
    public Demo14RegisterException(){

    }

    /**
     * 添加一个带有异常信息的构造方法
     * 查看源码发现,所有异常类都会有一个带异常信息的构造方法,方法内部会调用父类带异常信息的构造方法,让父类来处理这个异常信息
     * */
    public Demo14RegisterException(String message){
        super(message);
    }
}

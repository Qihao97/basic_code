package cn.edu.henau.chapter1_abnormal;

import java.io.IOException;

/**
 * Author: Qihao
 * Date: 2019/12/10  11:07
 * Content:
 * finally代码块:
 *   格式:
 *     try{
 *         可能产生异常的代码;
 *     }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *         异常的处理逻辑,异常对象之后,怎样处理异常对象
 *         在工作中,一般将异常信息记录到一个日志中
 *     }
 *     ...
 *     catch(异常类名 变量名){
 *         异常处理逻辑;
 *     }finally{
 *         无论是否出现异常都要执行;
 *     }
 *
 * 注意事项:
 *   1.finally不能够单独使用,必须和try一起使用
 *   2.finally一般用于资源释放(资源回收),无论程序是否出现异常,最终都要做资源的释放
 */
public class Demo10FinallyCodeBlock {
    public static void main(String[] args) {
        try {
            readFile("C:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            无论是否出现异常都会执行
            System.out.println("资源释放!");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对!");
        }
        System.out.println("路径没有问题,读取文件!");
    }
}

package cn.edu.henau.chapter1_abnormal;

/**
 * Author: Qihao
 * Date: 2019/11/29  10:17
 * Content:
 * 异常的处理:
 * Java处理异常的五个关键字: try、catch、finally、throw、throws
 *
 * 抛出异常 throw
 * throw关键字的作用:
 *      可以使用throw关键字在指定的方法中抛出指定的异常
 * 使用格式:
 *     throw new xxxException("异常产生的原因);
 *
 * 注意事项:
 *     1. throw关键字必须写在方法的内部
 *     2. throw关键字后面new的对象必须是Exception或者是Exception的子类对象
 *     3. throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
 *          a. throw后面创建的是RuntimeException或者是RuntimeException的子类对象,
 *             我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
 *          b. throw后面如果创建的是编译异常(写代码时期出现的异常),我们就必须处理这个异常,
 *             要么throws,要么try...catch
 *     4.
 */
public class Demo03_Exception_Handle {
    public static void main(String[] args) {

    }

    /**
     * 定义一个方法,获取数组指定索引处的元素:
     * 参数; int[] arr, int index
     * 注意:
     *      在工作中,我们首先要对方法传递过来的参数进行合法性校验,
     *      如果参数不合法,那么我们就必须使用抛出异常的方式告知方法的调用者,传递的参数有问题
     * */

    public static int getElement(int[] arr,int index){
        /**
         * 我们可以对传递过来的参数数组进行合法性的校验
         * 如果数组arr的值是null,
         * 那么我们就抛出空指针异常,告知方法的调用者,"传递的数组的值是null"
         * */
        if (arr == null){
            throw new NullPointerException("传递的数组的值是null.");
        }
        System.out.println("该数组在 " + index + " 处的元素是: " + arr[index]);
        int i = arr[index];
        return i;
    }

}

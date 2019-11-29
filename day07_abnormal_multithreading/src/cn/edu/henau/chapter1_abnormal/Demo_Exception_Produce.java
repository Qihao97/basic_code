package cn.edu.henau.chapter1_abnormal;

/**
 * Author: Qihao
 * Date: 2019/11/29  9:58
 * Content:
 * 本例用以演示异常的产生过程
 * 分析异常是如何产生的,以及如何去处理异常
 *
 * 如果访问数组中不存在的索引位置,JVM会检测出程序出现了异常:
 * 此时,JVM会做两件事:
 *     1. JVM会根据异常产生的原因创建一个异常对象,这个异常对象包含了异常产生的内容,原因和位置
 *          new ArrayIndexOutOfBoundsException("78")
 *     2. 在getElement()方法中,没有异常的处理逻辑(try...catch),那么JVM就会把异常对象抛出给方法的调用者,即main()方法,来处理该异常
 *     3. main()方法接收到了这个异常对象,但是main()方法也没有异常的处理逻辑,那么就会继续把该异常对象抛出给main()方法的调用者JVM来处理
 *     4. JVM接收到了这个异常对象,做了两件事,,,
 *          (1) 把异常对象(内容,原因,位置)以红色的字体打印在控制台
 *          (2) JVM会终止当前正在执行的Java程序 --> 中断处理
 *     5.
 *
 */
public class Demo_Exception_Produce {
    public static void main(String[] args) {
        int[] arrInt = {12,23,34,45,56,78,89,91,10,20,30,40,50,60,70,80,90};
        int element = getElement(arrInt, 6);
    }

    /**
     * 定义一个方法,获取数组指定索引处的元素
     * 参数,int[],int index
     * 返回值: int
     * */
    public static int getElement(int[] arr, int index){
        System.out.println("该数组在 " + index + " 处的元素是: " + arr[index]);
        int i = arr[index];
        return i;
    }
}

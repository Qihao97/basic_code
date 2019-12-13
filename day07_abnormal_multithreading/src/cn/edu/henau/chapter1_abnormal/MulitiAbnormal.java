package cn.edu.henau.chapter1_abnormal;

import java.util.List;

/**
 * Author: Qihao
 * Date: 2019/12/10  11:21
 * Content:
 * 多个异常使用捕获的处理方式:
 *   1. 多个异常分别处理
 *   2. 多个异常一次捕获,多次处理
 *   3. 多个异常一次捕获,一次处理

    一个try多个catch的注意事项:
      catch里面定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
      ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
 */
public class MulitiAbnormal {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3};
        System.out.println(arr[3]);

        List<Integer> list = List.of(1,2,3);
        System.out.println(list.get(3));*/

//        多个异常分别处理
        System.out.println("多个异常分别处理");
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("后续代码");

//        多个异常,一次捕获,多次处理
        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        System.out.println("多个异常,一次捕获,多次处理");
        try{
            int[] arr1 = {1,2,3,4,5};
            System.out.println(arr1[5]);

            List<Integer> list1 = List.of(1,2,3,4,5);
            System.out.println(list1.get(6));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

//        多个异常,一次捕获,一次处理
        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        System.out.println("多个异常,一次捕获,一次处理");
        try{
            int[] arr3 = {1,2,3,4,5,6};
            System.out.println(arr3[9]);

            List<Integer> list2 = List.of(1,2,3,4,5,6);
            System.out.println(list2.get(8));
        }catch (Exception e){
            System.out.println(e);
        }

        /**
         * 运行时的异常被抛出也可以不作处理,就是不捕获也不声明抛出
         * 默认会交给JVM来处理,即终止程序,打印异常,等什么时候不抛出异常了,再来继续执行程序
         * */


    }
}

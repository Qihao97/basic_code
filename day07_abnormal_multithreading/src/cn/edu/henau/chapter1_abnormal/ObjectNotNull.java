package cn.edu.henau.chapter1_abnormal;

import java.util.Objects;

/**
 * Author: Qihao
 * Date: 2019/11/29  13:01
 * Content:
 * Objects非空判断
 *
 * Objects类中的静态方法
 * public static <T> T requireNonNull(T obj): 判断指定引用对象是否为null
 * source code:
 *      public static <T> T requireNonNull(T obj){
 *          if (obj == null)
 *              throw new NullPointerException();
 *          return obj;
 *      }
 */
public class ObjectNotNull {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        对传递过来的参数进行合法性判断,判断是否为null
       /* if (obj == null){
            throw new NullPointerException("传递对象的值为null");
        }*/

//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象为null");
    }
}

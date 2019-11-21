package cn.edu.henau.generic.generic_method;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:02
 * Content:
 * 含有泛型的方法
 * 格式:
 *    修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
 *        方法体;
 *    }
 *    含有泛型的方法,在调用方法的时候确定泛型的数据类型
 *    传递什么类型的泛型,就是什么类型
 */
public class Generic_Class {
//    定义一个含有泛型的方法
    public <E> void method1(E e){
        System.out.println("这是一个含有泛型的方法 " + e);
    }

//    定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println("含有泛型的静态方法  " + s);
    }
}

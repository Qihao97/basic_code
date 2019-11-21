package cn.edu.henau.generic.generic_interface;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:25
 * Content:
 * 含有泛型的接口第二种使用方式: 接口使用什么泛型,实现类就使用什么泛型,类就跟着接口走
 * 就相当于定义了一个含有泛型的类,创建对象的时候确定泛型的类型
 *
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println("第二种使用带有泛型的接口的方式   " + i);
    }
}

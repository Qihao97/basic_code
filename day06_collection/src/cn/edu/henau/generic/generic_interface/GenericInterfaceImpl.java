package cn.edu.henau.generic.generic_interface;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:16
 * Content:
 * 含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,制定接口的泛型
 * public interface Iterator<E>{
 *     E next();
 * }
 */
public class GenericInterfaceImpl implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println("实现含有泛型的接口  " + s);
    }
}

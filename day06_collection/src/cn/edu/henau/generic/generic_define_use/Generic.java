package cn.edu.henau.generic.generic_define_use;

/**
 * Author: Qihao
 * Date: 2019/11/21  17:29
 * Content:
 * 定义一个含有泛型了类,模拟ArrayList集合
 * 泛型是一个未知的数据类型,当我们不确定什么数据类型的时候,可以使用泛型
 * 泛型可以接收任意的数据类型
 * 创建对象的时候确定泛型的数据类型
 */
public class Generic<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

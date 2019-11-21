package cn.edu.henau.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: Qihao
 * Date: 2019/11/21  13:26
 * Content:
 * 泛型是一种未知的数据类型,当我们不知道用什么类型的时候,可以使用泛型
 * 泛型也可以看作是一个变量,用来接收数据类型
 *      E e: Element元素
 *      T t: Type 类型
 * ArrayList集合在定义的时候,使用了泛型
 * E 代表未知的类型
 * 在创建集合对象的时候,会确定泛型的数据类型,把数据类型作为参数传递,赋值给泛型E
 *
 */
public class Generic_Overview {
    public static void main(String[] args) {
        show1();
        System.out.println("---------华丽的分割线---------");
        show2();
    }

//    创建集合对象,使用泛型
    /**
     * 好处:
     *    1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
     *    2.把运行期间的异常(代码执行时才能抛出),提升到了编译期
     * 弊端:
     *    泛型是什么类型,就只能存储什么类型
     * */
    private static void show2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1);  不可存储int类型
    }

    /**
     * 创建集合,不使用泛型
     *    好处:集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
     *    弊端:此时集合不安全,会引发异常
     * */
    private static void show1() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
//        使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);

//            想要使用String类特有的方法,length来获取字符串的长度,不能直接使用,需要向下转型
            String s = (String)next;
            System.out.println(s.length());
        }
    }
}

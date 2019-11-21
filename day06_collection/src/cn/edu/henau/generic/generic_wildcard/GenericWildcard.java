package cn.edu.henau.generic.generic_wildcard;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:34
 * Content:
 * 泛型的通配符:
 *      ?:代表任意的数据类型
 * 使用方式:
 *      不能创建对象使用,只能作为方法的参数使用
 *
 *
 */
public class GenericWildcard {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");

        printArray(integers);
        System.out.println("--------华丽的分割线--------");
        printArray(strings);

    }

    /**
     * 定义一个方法,可以遍历所有类型的ArrayList集合
     * 这时,我们不知道ArrayList集合使用什么数据类型,可以用泛型的通配符 ? 来接收数据类型
     * tips:
     *  泛型是没有继承概念的
     * */
    public static void printArray(ArrayList<?> list){
//        使用迭代器遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

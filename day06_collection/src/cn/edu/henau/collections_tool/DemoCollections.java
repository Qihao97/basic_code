package cn.edu.henau.collections_tool;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author: Qihao
 * Date: 2019/11/24  20:38
 * Content:
 * java.utils.Collections 是集合工具类,用来对集合进行操作.常用方法如下:
 *     public static <T> boolean addAll(Collection<T> c,T...elements): 往集合中添加一些元素
 *     public static void shutffle(list<?> list): 打乱集合的顺序
 *
 */
public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        往集合中添加多个元素
//        list.add("a");
//        list.add("b");

//        addAll()方法,往集合中添加多个元素
        Collections.addAll(list, "a","b","c","d","e","f","g");
        System.out.println(list);

        System.out.println("调用shuffle()方法,打乱集合的顺序:");
        Collections.shuffle(list);
        System.out.println(list);

    }
}
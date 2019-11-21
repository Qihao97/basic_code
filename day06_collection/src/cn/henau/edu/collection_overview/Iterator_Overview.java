package cn.henau.edu.collection_overview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author: Qihao
 * Date: 2019/11/21  11:09
 * Content:
 * java.util.Irerator
 * 用来遍历集合中的元素
 * 迭代:Collection集合元素的通用获取方式,在取元素之前,要先判断集合中有没有元素,如果有,就把这个元素取出来,
 * 然后继续判断,如果还有,就继续取出,直到将集合中元素全部取出.这种取出方式,专业术语成为迭代
 *
 * 方法:
 * boolean hasNext():如果仍有元素,返回true,否则返回false
 * E next(): 返回迭代的下一个元素
 * remove(): 从迭代器指向的collection中移除迭代器返回的最后一个元素(可选操作)
 *
 * Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
 * Collection接口中有一个方法,叫做iterator(),这个方法返回的就是迭代器的实现类对象
 *
 * 迭代器的使用步骤(重点):
 *    1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口来接收(多态)
 *    2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
 *    3.使用Iterator接口中的方法next()来取出集合中的下一个元素
 */
public class Iterator_Overview {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        ((ArrayList<String>) coll).add("郑州");
        ((ArrayList<String>) coll).add("重庆");
        ((ArrayList<String>) coll).add("上海");
        ((ArrayList<String>) coll).add("南阳");
        ((ArrayList<String>) coll).add("新野");
        ((ArrayList<String>) coll).add("王集");
        ((ArrayList<String>) coll).add("杭州");
        ((ArrayList<String>) coll).add("襄阳");
        ((ArrayList<String>) coll).add("白河");
        Iterator<String> iterator = coll.iterator();
        System.out.println(iterator.hasNext());
        for (int i = 0; i < coll.size(); i++) {
            System.out.println("---------华丽的分割线----------");
            System.out.println("NO." + i);
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
            if (i == coll.size() - 1){
                System.out.println("遍历完成后再调用两次hasNext()方法");
                System.out.println(iterator.hasNext());
                System.out.println(iterator.hasNext());
            }
            System.out.println("--------华丽的分割线---------");
//            System.out.println(iterator.next());
        }

        /**
         * 1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口来接收(多态)
         * 注意:
         *    Iterator<E> 接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
         * */
//        多态的方式创建一个实现类对象
        Iterator<String> iterator1 = coll.iterator();
    }
}

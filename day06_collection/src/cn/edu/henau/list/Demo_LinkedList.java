package cn.edu.henau.list;

import java.util.LinkedList;

/**
 * Author: Qihao
 * Date: 2019/11/23  18:05
 * Content:
 * ArrayList的底层是由数组来实现的,查询快,增删慢,对于需要大量查询的集合比较适合,多线程
 * LinkedList集合的数据存储结构是双向链表结构,方便元素的添加和删除,,查询慢,增删快,多线程
 *      LinkedList集合有大量的操作首尾元素的方法
 *      addFirst(E e),addLast(E e)将指定的元素添加到列表的开头和结尾
 *      getFirst(),getLast():获取集合的开头和末尾的元素
 *      removeFirst(),removeLast():移除并返回集合的开头和末尾的元素
 *      pop():从此列表所表示的堆栈处弹出一个元素,即移除并返回此列表的第一个元素,等效于 removeFirst()
 *      push(E e):将元素推入此列表所表示的堆栈.即 将该元素插入到此列的开头...等效于 addFirst(E e)
 *      public boolean isEmpty(): 如果列表不包含元素,则返回true
 *      clear():清空集合中的元素
 *
 *  java.util.linkedList集合 implements List接口
 *  LinkedList集合的特点:
 *      1.底层是一个链表结构
 *      2.里边包含了大量操作首尾元素的方法
 *  注意:使用LinkedList集合特有的方法,不能够使用多态
 *  当使用getFirst(),get(int index),当集合为空或者集合中没有该元素时,会报错,NoSuchElementException错误
 *  使用getFirst()方法前,可以使用isEmpty()进行判断
 *
 */
public class Demo_LinkedList {
    public static void main(String[] args) {
//        show01();  //添加的方法
//        show02();  //获取的方法
        show03();
    }

    private static void show03() {
//        移除元素的方法
//        removeFirst(),removeLast():移除并返回集合的开头和末尾的元素
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("严谨");
        stringLinkedList.add("务实");
        stringLinkedList.add("高效");
        stringLinkedList.add("创新");

        String s = stringLinkedList.removeFirst();
        System.out.println("被移除的第一个元素:  " + s);
        String s1 = stringLinkedList.removeLast();
        System.out.println("被移除的最后一个元素:  " + s1);
        System.out.println("此时的LinkedList集合中所有的元素如下:");
        System.out.println(stringLinkedList);
    }

    private static void show02() {
        java.util.LinkedList<String> stringLinkedList = new java.util.LinkedList<>();
        stringLinkedList.add("Alice");
        stringLinkedList.add("Jack");
        stringLinkedList.add("Tom");

        String first = stringLinkedList.getFirst();
        System.out.println("该集合的第一个元素是:  " + first);
        String last = stringLinkedList.getLast();
        System.out.println("该集合的最后一个元素是:  " + last);

        System.out.println("第2个位置上的元素: " + stringLinkedList.get(1));

        LinkedList<String> stringLinkedList1 = new LinkedList<>();
    }

    private static void show01() {
//        创建LinkedList集合
        java.util.LinkedList<String> strings = new java.util.LinkedList<>();
//        使用add方法网集合中添加元素
        strings.add("郑州");
        strings.add("上海");
        strings.add("昆山");
        strings.add("襄阳");
        strings.add("南阳");
        strings.add("新野");
        System.out.println(strings);

        System.out.println("------------*********华丽的分割线**********----------------");
        System.out.println("使用addFirst()往集合的开头添加元素:");
        strings.addFirst("中国");
        System.out.println(strings);

        System.out.println("------------*********华丽的分割线**********----------------");
        System.out.println("使用push()往集合的开头添加元素:");
        strings.push("地球");
        System.out.println(strings);

        System.out.println("------------*********华丽的分割线**********----------------");
        System.out.println("使用addLast()往集合的开头添加元素:");
        strings.addLast("王集镇");
        System.out.println(strings);
    }
}

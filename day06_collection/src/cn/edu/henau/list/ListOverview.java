package cn.edu.henau.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Qihao
 * Date: 2019/11/22  20:01
 * Content:
 * List集合介绍和常用的方法
 * java.util.List接口 extends Collection接口
 * List接口的特点：
 *    1.有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
 *    2.有索引,包含了一些带索引的方法
 *    3.允许存储重复的元素
 * List接口中带索引的方法(特有):
 *    public void add(int index, E element):将指定的元素,添加到该集合中的指定位置上
 *    public E get(int index): 返回集合中指定位置的元素
 *    public E remove(int index): 移除列表中指定位置的元素,返回的是被移除的元素
 *    public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值是更新前的元素
 *
 * 注意:
 *     操作索引的时候,一定要注意防止索引越界异常
 *     IndexOutOfBoundsException: 索引越界异常,集合会报错
 *     ArrayIndexOutOfBoundsException:数组索引越界异常
 *     StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class ListOverview {
    public static void main(String[] args) {
//        创建一个List集合,多态
        List<String> strings = new ArrayList<>();
        strings.add("Henan");
        strings.add("Zhengzhou");
        strings.add("Nanyang");
        strings.add("Beijing");
        strings.add("Luoyang");
        strings.add("Kaifeng");
        strings.add("Jinshui");
        strings.add("Xinye");
//        打印集合,重写了toString方法
        System.out.println(strings);
        System.out.println("------------华丽的分割线-------------");
        for (String s :
                strings) {
            System.out.println(s);
        }
        /**
         * public void add(int index, E element): 将指定的元素,添加到该结合中指定的位置上
         * 在索引3上添加一个元素
         * */
         strings.add(3,"Shanghai");
        System.out.println("------------华丽的分割线-------------");
        System.out.println(strings);
        /**
         * public E remove(int index): 移除指定索引位置上的元素,并且返回被移除的元素
         * */
        strings.remove(5);
        System.out.println("------------华丽的分割线-------------");
        System.out.println(strings);

        /**
         * public E set(int index,E element):用指定的元素替换指定位置上的元素,返回的是被替换的元素
         * */
        strings.set(5,"Chongqing");
        System.out.println("------------华丽的分割线-------------");
        System.out.println(strings);

        /**
         * List集合的遍历有三种方式:
         *    1.普通的for循环
         *
         * */
        System.out.println("------------华丽的分割线-------------");
        System.out.println("**********使用普通的for循环进行遍历***********");
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }
        System.out.println("------------华丽的分割线-------------");
        System.out.println("*********使用迭代器进行集合的遍历************");
        Iterator<String> it = strings.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------华丽的分割线-------------");
        System.out.println("***********使用增强for循环进行遍历-*********");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

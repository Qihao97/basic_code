package cn.edu.henau.collectionSet.hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/23  20:39
 * Content:
 * java.util.Set接口 extends Collection接口
 * Set接口的特点:
 *    1.不允许存储重复的元素
 *    2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *
 * java.util.HashSet集合  实现了Set接口,由哈希表(HashMap实例),它不保证set的迭代顺序,尤其是不保证该顺序恒久不变,允许使用null值
 * 是一个不包含重复元素的collection,不能够存储重复元素
 *
 * HashSet集合的特点:
 *    1.不允许存储重复的元素
 *    2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *    3.是一个无序的集合,存储元素的顺序与取出元素的顺序不保证一致
 *    4.底层是一个哈希表结构(查询的速度非常快)
 */
public class HashSetOverview {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
//        使用add方法,往集合中添加元素
        for (int i = 0; i < 9; i++) {
            integers.add(100 - i);
        }
//        遍历集合,使用迭代器
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        使用增强for循环遍历集合
        System.out.println("使用增强for循环遍历集合:");
        for (int i :
                integers) {
            System.out.println(i);
        }
    }
}

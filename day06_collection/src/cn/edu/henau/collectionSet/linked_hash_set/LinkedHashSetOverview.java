package cn.edu.henau.collectionSet.linked_hash_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Author: Qihao
 * Date: 2019/11/24  19:10
 * Content:
 * java.util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合的特点:
 *      底层是一个 哈希表(数组 + 链表 / 红黑树) + 链表: 多了一条链表,用来存储元素的顺序
 *
 *      存储有序的不允许重复的元素
 */
public class LinkedHashSetOverview {
    public static void main(String[] args) {
//        HashSet无序的,而且不允许重复
        HashSet<String> strings = new HashSet<>();
        strings.add("China");
        strings.add("China");
        strings.add("Nanyang");
        strings.add("Xinye");
        System.out.println(strings);

        System.out.println("---------*****华丽的分割线*****---------");
        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings1.add("China");
        strings1.add("China");
        strings1.add("Xinye");
        strings1.add("Nanyang");
        strings1.add("US");
        System.out.println(strings1);
    }
}

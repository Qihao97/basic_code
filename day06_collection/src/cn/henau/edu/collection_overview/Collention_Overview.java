package cn.henau.edu.collection_overview;

/**
 * Author: Qihao
 * Date: 2019/11/18  20:21
 * Content:
 * 集合概述:
 *  集合:Java提供的一种容器,用来存储多个数据
 *  与数组的区别:
 *     1.数组的长度固定,集合长度可变
 *     2.数组中存储的是同一类元素,可以存储基本数据类型值,集合中存储的都是对象,对象类型可以不一致
 *       在开发中,当对象多的时候,使用集合进行存储
 *
 *  学习集合的目标:
 *      1.会使用集合存储数据
 *      2.会遍历集合,把数据取出来
 *      3.掌握每种集合的特性
 * List接口:
 *   1.有序的集合(存储和取出元素顺序相同)
 *   2.允许存储重复的元素
 *   3.有索引,可以使用普通的for循环遍历
 *   4.子类有Vector集合,ArrayList集合,LinkList集合
 * 继承:
 *   子类共性抽取,形成父类(接口)
 *
 * Set接口:
 *    1.不允许存储重复元素
 *    2.没有索引(不能使用普通for循环遍历)
 *    3.
 * Collection接口:
 *    定义的是所有单列集合中共性的方法
 *    所有单列集合都可以使用共性的方法
 *    没有带索引的方法
 *集合框架的学习方式:
 *   1.学习顶层:学习顶层接口/抽象类中共性的方法,所有的子类都可以使用
 *   2.使用底层:底层不是接口就是抽象类,无法创建对象使用,需要使用底层的子类创建对象使用
 *
 *
 */
public class Collention_Overview {
    public static void main(String[] args) {
        System.out.println("Zhengzhou,Shanghai");

    }
}

package cn.henau.edu.collection_overview;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: Qihao
 * Date: 2019/11/20  9:52
 * Content:
 * java.util.Collection接口:
 *     所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
 *     任意的单列集合都可以使用Collection接口中的方法
 *
 * Collection常用功能:
 *  public boolean add(E e):把给定的对象添加到当前集合中
 *  public void clear(): 清空集合中所有的元素
 *  public boolean remove(E e): 把给定的对象在集合中删除
 *  public boolean contains(E e):判断当前集合中是否包含给定的对象
 *  public boolean isEmpty():判断当前集合是否为空
 *  public int size(): 返回集合中元素的个数
 *  public Object[] toArray():把集合中的元素,存储到数组中
 */
public class Collention_Member_Method {
    public static void main(String[] args) {
//        创建一个集合对象,可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);   //重写了toString方法

    }
}

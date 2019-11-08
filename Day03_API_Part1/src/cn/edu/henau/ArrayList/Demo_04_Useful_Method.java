package cn.edu.henau.ArrayList;

import java.util.ArrayList;

/*
* ArrayList中常用的方法有:
* 1.add，，返回值表示添加是否成功
*   public boolean add(E e)
*   对于ArrayList集合来说，添加动作一定是成功的，所以返回值可用可不用
*   对于其他的集合来说，add添加动作是不一定成功的
* 2.从集合中获取元素：get方法，参数是索引编号，返回值就是对应位置的值
*   public E get(int index)
* 3.删除指定位置的元素,参数是索引编号，返回值是被删除的值
*   public E remove(int index)
* 4.获取集合的尺寸长度，返回值是集合中包含的元素个数
*   public int size();
* */
public class Demo_04_Useful_Method {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList);

//        向集合中添加元素：
        strList.add("Tom");
        strList.add("Jack");
        boolean success = strList.add("White");
        System.out.println("boolean: " + success);
        System.out.println(strList);

//        从集合中获取元素： get，索引值从0开始
        String name = strList.get(2);
        System.out.println("第二号索引位置：" + name);

//        从集合中删除元素： remove ，索引值从0开始
        String remove = strList.remove(2);
        System.out.println("被删除的人是：" + remove);
        System.out.println(strList);

//        获取集合的长度，即其中的元素个数
        int size = strList.size();
        System.out.println("集合的长度是： " + size);

        strList.add("Richard");
        strList.add("Jim");
        strList.add("Sun");
        strList.add("Qbei");

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + "\t");
        }
        System.out.println();
    }
}

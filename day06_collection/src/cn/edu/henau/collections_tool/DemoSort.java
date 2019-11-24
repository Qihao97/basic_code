package cn.edu.henau.collections_tool;

import cn.edu.henau.collectionSet.hash_set.Student;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author: Qihao
 * Date: 2019/11/24  22:06
 * Content:
 * public static <T> void sort(List<T> list): 将集合中的元素按照默认规则排序
 *
 * 注意:
 *    sort(List <T>)使用前提
 *    被排序集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序规则
 *
 *  Comparable接口的排序规则:
 *    自己(this) - 参数: 升序
 *    反之降序
 */
public class DemoSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       /* list.add(23);
        list.add(34);
        list.add(12);
        list.add(15);
        list.add(20);*/

       Collections.addAll(list,21,23,54,86,55,42,20);

        System.out.println(list);
        System.out.println("---------*****华丽的分割线*****---------");
        Collections.sort(list);
        System.out.println(list);

//        自定义对象
        System.out.println("---------*****华丽的分割线*****---------");
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,new Student("后羿",1200,001),new Student("精卫",1300,002),new Student("夸父",2000,003),
                new Student("刘备",40,004));
        System.out.println(students);
        System.out.println("使用sort排序后");
        Collections.sort(students);
        System.out.println(students);
    }
}

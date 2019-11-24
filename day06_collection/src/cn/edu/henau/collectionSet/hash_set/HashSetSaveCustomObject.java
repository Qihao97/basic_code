package cn.edu.henau.collectionSet.hash_set;

import java.util.HashSet;

/**
 * Author: Qihao
 * Date: 2019/11/24  18:59
 * Content:
 * 使用HashSet存储用户自定义的对象
 * 使用HashSet存储用户自定义的对象,要想保证元素唯一,必须重写自定义对象的 hashCode()方法和equals()方法
 *
 */
public class HashSetSaveCustomObject {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student 美女1 = new Student("小美女", 18, 001);
        Student 美女2 = new Student("小美女", 18, 001);
        Student 美女3 = new Student("小美女", 18, 001);
        Student 美女4 = new Student("小美女", 18, 001);

        students.add(美女1);
        System.out.println(students);
        System.out.println("--------*****华丽的分割线*****--------");
        students.add(美女2);
        students.add(美女3);
        students.add(美女4);
        System.out.println(students);
        System.out.println("--------*****华丽的分割线*****--------");
        System.out.println(美女1.hashCode());
        System.out.println(美女2.hashCode());
        System.out.println(美女3.hashCode());
        System.out.println(美女4.hashCode());
    }
}

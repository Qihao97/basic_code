package cn.edu.henau.collections_tool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Author: Qihao
 * Date: 2019/11/25  8:46
 * Content:
 *
 * Comparator 和 Comparable的区别:
 *     Comparable:自己(this)和别个(参数)比较,自己需要实现Comparable接口,重写比较规则compareTo方法
 *     Comparator: 相当于找一个第三方的裁判来比较两者
 */
public class Demo_Sort_Comparable {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,5,4,7,8,2,3,6,1,9);

        System.out.println(list1);
        System.out.println("使用sort排序后:");
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("使用shuffle打乱顺序后:");
        Collections.shuffle(list1);
        System.out.println(list1);

        System.out.println("---------*****华丽的分割线*****---------");
        Collections.sort(list1, new Comparator<Integer>() {
//            重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;  //前边减去后边,是升序
            }
        });

        System.out.println(list1);
        System.out.println("---------华丽的分割线---------");
        System.out.println(list1);
        System.out.println("---------Gorgeous Dividing Line---------");
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     //降序排序
            }
        });
        System.out.println(list1);

        System.out.println("---------Gorgeous Dividing Line");
        ArrayList<StudentTest> students = new ArrayList<>();
        Collections.addAll(students,new StudentTest("Alice",16),new StudentTest("Allen",15),
                new StudentTest("Jack",18),new StudentTest("Merry",17),new StudentTest("Jane",19));
        System.out.println("未排序的students集合:");
        System.out.println(students);
        System.out.println("使用sort排序后:");
        Collections.sort(students, new Comparator<StudentTest>() {
            @Override
            public int compare(StudentTest o1, StudentTest o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(students);
        System.out.println("使用sort降序排列后:");
//        如果两个年龄是一样的,默认哪个写前边,哪个就排在前边
        Collections.sort(students, new Comparator<StudentTest>() {
            @Override
            public int compare(StudentTest o1, StudentTest o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(students);

        System.out.println("---------Gorgeous Dividing Line---------");
        System.out.println("集合原来的顺序为:");
        System.out.println(students);
        System.out.println("使用sort排序后的集合为:");
        Collections.sort(students, new Comparator<StudentTest>() {
            @Override
            public int compare(StudentTest o1, StudentTest o2) {
                int com = o1.getName().compareTo(o2.getName());
                return com;
            }
        });
        System.out.println(students);


    }
}
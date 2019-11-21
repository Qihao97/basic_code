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
        System.out.println(coll);   //重写了toString方法 []
        /**
         * public boolean add(E e): 把给定的对象添加到当前集合中
         * 返回值是一个boolean值,一般都返回true,可以不用接收
         */
        boolean b1 = coll.add("Chongqing");
        System.out.println("b1: " + b1);
        System.out.println(coll);
        ((ArrayList<String>) coll).add("Zhengzhou");
        ((ArrayList<String>) coll).add("Shanghai");
        ((ArrayList<String>) coll).add("Nanyang");
        ((ArrayList<String>) coll).add("Xinye");
        ((ArrayList<String>) coll).add("Wangji");
        ((ArrayList<String>) coll).add("Qilou");
        System.out.println(coll);
        System.out.println("Coll's size is:  " + coll.size());

        /**
         *  public boolean remove(E e): 把给定的对象在集合中删除
         *  返回值是一个Boolean值,集合中如果存在该元素,会删除该元素,然后返回true
         *  集合中不存在该元素,删除失败,返回false
         */
        System.out.println("----------华丽的分割线----------");
        boolean b2 = coll.remove("Shanghai");
        System.out.println("b2 is: " + b2);
        System.out.println(coll);
        boolean b3 = coll.remove("Beijing");
        System.out.println(b3);

        /**
        * public boolean contains(E e):判断当前集合中是否包含给定的对象
         * 返回值是一个boolean值,包含返回true,不包含返回false
         * 不影响集合元素
        * */
        System.out.println("----------华丽的分割线----------");
        boolean b4 = coll.contains("Zhwngzhou");
        System.out.println("b4 is: " + b4);

        /**
         * public boolean isEmpty():判断当前集合是否为空
         * 为空返回true,不为空返回false
         * */
        System.out.println("----------华丽的分割线----------");
        boolean b6 = coll.isEmpty();
        System.out.println("b6 is:  " + b6);
        Collection<String> arrayList = new ArrayList<>();
        System.out.println("arrayList is Empty??  " + arrayList.isEmpty());

        /**
         * public int size():返回集合中元素的个数
         * */
        System.out.println("----------华丽的分割线----------");
        int size_coll = coll.size();
        int size_arrayList = arrayList.size();
        System.out.println("size of coll is:  " + size_coll);
        System.out.println("size of arrayList is:  " + size_arrayList);

        /**
         * public Object[] toArray():把集合中的元素,存储到数组中
         * */
        System.out.println("----------华丽的分割线----------");
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        /**
         *public void clear(): 清空集合中所有的元素
         * 不删除集合,集合还存在
         * */
        System.out.println("----------华丽的分割线----------");
        System.out.println("使用clear方法删除元素前: ");
        System.out.println(coll);
        System.out.println("coll is Empty??  " + coll.isEmpty());
        System.out.println("使用clear方法删除元素后: ");
        coll.clear();
        System.out.println(coll);
        System.out.println("coll is Empty??  " + coll.isEmpty());
    }
}

package cn.edu.henau.map_collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Qihao
 * Date: 2019/11/25  10:20
 * Content:
 * java.util.Map<K,V>集合
 * Map集合的特点:
 *    1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
 *    2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
 *    3.Map集合中的元素,key不允许重复,value可以重复
 *    4.Map集合中的元素,key和value是一一对应的
 *
 * Map接口的常用实现类: HashMap
 *
 * HashMap:
 *     1.基于哈希表的 Map接口实现,允许null值和null键,底层是哈希表,查询速度很快
 *        JDK 1.8之前: 数组 + 单向链表
 *        JDK 1.8之后: 数组 + 单向链表 / 红黑树(链表的长度超过 8): 提高查询的速度
 *     2.不保证映射的顺序,特别是不保证该顺序恒久不变
 *     3.不同步的,即多线程
 *
 * java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
 * LinkedHashMap的特点:
 *     1.LinkedHashMap集合的底层是 哈希表 + 链表
 *     2.LinkedHashMap集合是一个有序的集合,存取元素的顺序是一致的
 *
 * Map接口中的常用方法:
 *      1. put(K key,V value): 将指定的值与此映射中指定的键关联,,添加元素的时候,Key不存在,返回空,Key存在,返回Value
 *      2. get(Object key): 返回指定键所映射的值,如果此映射不包含该键的映射关系,则返回null
 *      3. remove(Object key): 如果存在 一个键的映射关系,则将其从映射中移除,,返回被删除的值
 *      4. boolean containsKey(Object key): 如果此映射包含指定键的映射关系,则返回true
 *      5. entrySet() 返回此映射中包含的映射关系的 Set 视图
 */
public class Map_Test {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
//        判断集合中是否包含指定的键,有返回true,没有返回false
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"China");
        map.put(2,"Henan");
        map.put(3,"Taipei");
        map.put(4,"HongKong");
        map.put(5,"Macao");
        System.out.println(map);
        boolean b = map.containsKey(5);
        System.out.println(b);
    }

    private static void show03() {
//        get方法
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"China");
        map.put(2,"Taipei");
        map.put(3,"Hongkong");
        System.out.println(map);
        System.out.println("3 is :  " + map.get(3));
    }

    /**
     *  pubic V put(K key,V value): 把指定的键与指定的值添加到 Map 集合中.
     *      返回值: V
     *          存储键值对的时候,key不重复,返回的 V 是 null
     *          存储键值对的时候,如果 key 重复,会使用新的 value 来替换 Map中重复的 value,返回被替换的 value值
     * */
    private static void show01() {
//        创建 Map集合,使用多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("焦仲卿", "刘兰芝");
        System.out.println("v1:  " + v1);
        String v2 = map.put("张生", "崔莺莺");
        System.out.println("v2:  " + v2);
        String v3 = map.put("aaa", "bbb");
        System.out.println("v3:  " + v3);
        String v4 = map.put("aaa", "ccc");
        System.out.println("v4:  " + v4);
        System.out.println(map.get("aaa"));
        System.out.println(map);
        String v5 = map.put("杨过", "小龙女");
        String v6 = map.put("尹志平", "小龙女");
        System.out.println(map);

        /**
         * public V remove(Object key): 如果存在 一个键的映射关系,则将其从映射中移除,,返回被删除的值
         *  返回值 V:
         *      key存在,返回被删除的值,,key不存在,v返回null
         * */

    }
    private static void show02(){
//            创建Map集合对象
        HashMap<Integer, String> beauty = new HashMap<>();
        beauty.put(001,"古力娜扎");
        beauty.put(002,"迪丽热巴");
        beauty.put(003,"沙扬娜拉");
        beauty.put(004,"封茗囧菌");
        beauty.put(005,"桥边红药");
        System.out.println(beauty);
        String remove1 = beauty.remove(1);
        System.out.println("remove1:  " + remove1);
        String remove2 = beauty.remove(6);
        System.out.println(remove2);
        String s = beauty.get(5);
        System.out.println(s);
    }
}

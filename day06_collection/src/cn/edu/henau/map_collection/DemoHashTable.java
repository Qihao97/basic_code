package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Author: Qihao
 * Date: 2019/11/25  22:30
 * Content:
 * java.util.Hashtable<K,V>集合 implements Map<K,V>接口
 *
 * Hashtable:底层也是一个哈希表,是一个线程安全的集合,是单线程集合,速度慢
 * HashMap: 底层是一个哈希表,线程不安全,多线程,速度快
 *
 * HashMap集合 : 可以存储null值,null键
 * Hashtable集合: 不可存储null键和null值,是早期的双列集合,已被取代,
 * Hashtable的子类Properties依然使用
 * Properties集合是唯一一个和IO流相结合的集合
 *
 */
public class DemoHashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"China");
        map.put("Macao",null);
        map.put(null,null);
        System.out.println(map);

        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        Hashtable<String, String> table = new Hashtable<>();
//        Hashtable 不能存储空值,键与值都不可为空
//        table.put(null,"a");

    }
}

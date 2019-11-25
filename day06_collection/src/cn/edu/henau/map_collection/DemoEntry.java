package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Qihao
 * Date: 2019/11/25  20:57
 * Content:
 * 接口 Map.Entry<K,V>
 *     映射项(键-值 对)
 *
 * Map.Entry<K,V>: 在Map接口中有一个内部接口Entry
 * 作用: 当Map集合一创建,就会在Map集合中创建一个Entry对象,用来记录键与值(键值对 对象,键与值的映射关系)
 */
public class DemoEntry {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"China");
        map.put(2,"Taipei");
        map.put(3,"HongKong");
        map.put(4,"Macao");
        map.put(5,"Henan");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " ... " + entry.getValue());
        }
    }
}

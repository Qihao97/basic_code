package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Author: Qihao
 * Date: 2019/11/25  22:21
 * Content:
 * java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 *     Map接口的哈希表和链接列表实现,具有可预知的迭代顺序
 *     底层原理:
 *        哈希表 + 链表(记录元素的顺序)
 */
public class DemoLinkedHashMap {
    public static void main(String[] args) {
      /*  HashMap<String, String> map = new HashMap<>();
        map.put("China","Henan");
        map.put("Japan","Tokyo");
        map.put("Taiwan","Taipei");
        map.put("HongKong","Kaulung");
        System.out.println(map);*/

        LinkedHashMap<String, String> linkMap = new LinkedHashMap<>();
        linkMap.put("China","Henan");
        linkMap.put("Japan","Tokyo");
        linkMap.put("Taiwan","Taipei");
        linkMap.put("HongKong","Kaulung");
        System.out.println(linkMap);
    }
}

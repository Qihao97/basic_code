package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/25  20:57
 * Content:
 * 接口 Map.Entry<K,V>
 *     映射项(键-值 对)
 *
 * Map.Entry<K,V>: 在Map接口中有一个内部接口Entry
 * 作用: 当Map集合一创建,就会在Map集合中创建一个Entry对象,用来记录键与值(键值对 对象,键与值的映射关系)
 *
 * Map集合遍历的第二种方法,使用Entry对象遍历
 *
 * Map集合中的方法, Set<Map.Entry<k,v>> entrySet(): 返回此映射中包含的映射关系的 Set 视图
 *
 * 实现步骤:
 *    1.使用 Map集合中的方法entrySet(0,把 Map集合中多个 Entry对象取出来,存储到一个Set集合中
 *    2.遍历Set集合,获取每一个Entry对象
 *    3.使用Entry对象中的方法getKey()和getValue()方法获取键与值
 *
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

        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> next = it.next();
            System.out.println("key is:  " + next.getKey() + "  Value is:  " + next.getValue());
        }
    }
}

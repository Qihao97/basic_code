package cn.edu.henau.map_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/25  20:34
 * Content:
 * Map集合的第一种遍历方式: 通过键找值的方式
 * Map集合中的方法:
 *     Set<K> keySet() 返回此映射中包含的键的 Set视图
 *  实现步骤:
 *      1.使用Map集合中的方法keySet(),把Map集合所有的键取出来,存储到一个 Set 集合中
 *      2.遍历此Set集合,获取 Map 集合中的每一个 key
 *      3.通过 Map 集合中的方法 get(key),通过 key 找到value
 */
public class DemoKeySet {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"China");
        map.put(2,"Taipei");
        map.put(3,"HongKong");
        map.put(4,"Macao");
        map.put(5,"Henan");

//        1.使用Map集合中的方法keySet(),把Map集合所有的键取出来,存储到一个 Set 集合中
        Set<Integer> set = map.keySet();

//        2.遍历此Set集合,获取 Map 集合中的每一个 key
//        使用迭代器遍历
        ArrayList<String> Area = new ArrayList<>();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println(key + " = " + map.get(key));
            Area.add(map.get(key));
        }

//        使用增强for遍历Set集合
        ArrayList<String> value = new ArrayList<>();
        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        for (int key :
                set) {
            String s = map.get(key);
            System.out.println(key + " = " + s);
            value.add(s);
        }

        System.out.println(Area);
        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        System.out.println(value);
    }
}

package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/25  21:42
 * Content:
 * HashMap集合存储用户的自定义对象
 * Map集合保证元素是唯一的:
 *      作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class HashMapSaveUserDefine {
    public static void main(String[] args) {
        show1();
    }


    /**
     * key: String 类型
     *      String 类重写了 hashCode方法和equals方法,可以保证 key唯一
     * value: Person类型
     *      value可以重复(同名,同年龄)
     * */
    private static void show1() {
        HashMap<String,PersonTest> personMap = new HashMap<>();
        personMap.put("China",new PersonTest("Jane",12));
        personMap.put("American",new PersonTest("Jack",15));
        personMap.put("Japan",new PersonTest("Tom",73));
        personMap.put("Korea",new PersonTest("Snow",84));
//        使用keySet加增强for来遍历Map集合
        Set<String> set = personMap.keySet();
        for (String s : set) {
            System.out.println("Key is: " + s + "\tValue is: " + personMap.get(s));
        }

        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        Set<Map.Entry<String, PersonTest>> entries = personMap.entrySet();
        for (Map.Entry<String, PersonTest> entry : entries) {
            System.out.println("Key is:  " + entry.getKey() + "\tValue is:  " + entry.getValue());
        }
    }
}

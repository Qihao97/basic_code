package cn.edu.henau.map_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/26  9:51
 * Content:
 * 用户输入一个字符串,统计这个字符串中各字母出现的频次
 *
 * 步骤:
 *  1.使用Scanner获取一个用户输入的字符串
 *  2.创建Map集合,key是字符串中的字符,value是字符的个数
 *  3.遍历字符串,获取每一个字符
 *  4.使用获取到的字符,去Map集合中判断key值是否存在
 *      key存在: 通过字符(key),获取value(字符个数),,value++
 *              put(key,value)
 *      key不存在,put(key,1)
 *  5.遍历Map集合,输出结果
 */
public class MapScanCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer i = map.get(c);
                i++;
                map.put(c ,i);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " 在您输入的字符串中出现了 " + entry.getValue() +" 次");
        }

    }
}

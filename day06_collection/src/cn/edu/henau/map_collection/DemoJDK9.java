package cn.edu.henau.map_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author: Qihao
 * Date: 2019/11/26  12:42
 * Content:
 * JDK9的新特性:
 *      List接口,Set接口,Map接口: 里边增加了一个静态的方法of,可以给集合一次性添加多个元素
 *      static <E> List<E> of (E... elements)
 *
 *      使用前提: 当集合中存储的元素个数已经确定了,不再改变时使用
 *      注意:
 *          1.of方法只适用于List接口,Set接口,Map接口,不适用于接口的实现类
 *          2.of方法的返回值是一个不能改变的集合,集合不能再使用add方法和put方法来添加元素,否则抛出异常
 *          3.Set接口和Map接口在调用of方法的时候,不可以有重复的元素,否则抛出异常
 */
public class DemoJDK9 {
    public static void main(String[] args) {
        List<String> china = List.of("China", "Chinese Taipei", "China Hong Kong", "China Macao");
        System.out.println(china);
//        china.add("Henan");

        Set<String> china1 = Set.of("China", "Taipei", "Macao");
        System.out.println(china1);

        Map<String, String> china2 = Map.of("China", "Beijing", "U.S.", "NewYork");
        System.out.println(china2);

    }
}

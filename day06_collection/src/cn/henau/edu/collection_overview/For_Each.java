package cn.henau.edu.collection_overview;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: Qihao
 * Date: 2019/11/21  13:08
 * Content:
 * 增强for循环,用以遍历集合和数组
 * 内部实现原理还是Iterator迭代器,只能遍历,不可以对集合中的元素进行增删
 *
 * Collection<E> extends Iterable<E>:所有的单列集合都可以使用增强for
 * public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标.
 *
 * 格式:
 *    for(集合/数组中的元素的数据类型  变量名 : 集合名/数组名){
 *        System.out.println(变量名);
 *    }
 *tips:
 *   新for循环必须有遍历的目标,目标只能是Collection或者是数组,而且只能作为遍历操作出现,不能够删改数据
 */
public class For_Each {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        ((ArrayList<String>) coll).add("广州");
        ((ArrayList<String>) coll).add("厦门");
        ((ArrayList<String>) coll).add("福州");
        ((ArrayList<String>) coll).add("宁波");
        ((ArrayList<String>) coll).add("上海");

        System.out.println("使用foreach遍历coll集合:");
        for (String  colla:
             coll) {
            System.out.println(colla);
        }
    }
}

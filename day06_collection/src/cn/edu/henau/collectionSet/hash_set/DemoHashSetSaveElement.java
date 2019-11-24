package cn.edu.henau.collectionSet.hash_set;

import java.util.HashSet;

/**
 * Author: Qihao
 * Date: 2019/11/23  21:51
 * Content:
 * HashSet集合不允许存储重复元素的原理:
 * 前提: 存储的元素必须重写HashCode方法和equals方法
 *
 */
public class DemoHashSetSaveElement {
    public static void main(String[] args) {
//        创建HashSet集合对象
        HashSet<String> strings = new HashSet<>();
        String s1 = new String("China");
        String s2 = new String("China");
        strings.add(s1);
        strings.add(s2);
        strings.add("重地");
        strings.add("通话");
        strings.add("China");
        System.out.println(strings);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("China".hashCode());
        System.out.println("-------华丽的分割线-------");
        System.out.println((int)'我');
        System.out.println((int)'爱');
        System.out.println((int)'你');
//        集合中不允许存储重复元素,上述一通操作后,集合中存储了三个元素,,[重地,通话,China]

//        Set集合在调用add方法的时候,add方法会调用元素的hashCode方法和equals方法,判断元素是否重复
        /**
         * 上述一通操作中
         * 存储s1的时候
         * add方法会调用s1的hashCode方法,计算字符串"China"的哈希值,为65078583,
         * 在集合中找有没有65078583这个哈希值的元素,发现没有,就会把s1存储到集合中
         *
         * 存储s2的时候,同样调用s2的hashCode方法,...发现有冲突,就会调用s2的equals方法
         * 和哈希值相同的元素进行比较,发现相同,不存
         *
         *
         * */

    }
}

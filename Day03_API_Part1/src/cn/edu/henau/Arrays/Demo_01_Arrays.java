package cn.edu.henau.Arrays;

import java.util.Arrays;

/*
* java.util.Arrays类是一个与数组相关的工具类，里面提供了大量的静态方法
* 用以实现数组常见的操作
*
* 常用的方法：
* public static String toString(数组):将参数数组转换为字符串（按照默认格式：[元素1，元素2，……]
* public static void sort(数组): 默认升序对数组的元素进行排序
*
* 注意;
* 使用sort进行排序的时候，
* 1.如果是数值，则按数值大小升序排列
* 2.如果是英文字母，则按照字母对应的ASCII码表来升序排序
* 3.如果是中文，按中文的码表来升序排列
* 4.如果是自定义的类型，需要自定义的类有Comparable和Comparator接口的支持
*
* */
public class Demo_01_Arrays {
    public static void main(String[] args) {

//        toString()方法示例
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

//        排序
        int[] array1 = {34,56,32,12,45,67,87,65,45,89,98,76,56,77,85,39};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}

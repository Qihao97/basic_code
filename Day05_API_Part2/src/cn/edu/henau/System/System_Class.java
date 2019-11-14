package cn.edu.henau.System;

import java.util.Arrays;

/*
* java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作
* 常用的方法：
*   1.返回以毫秒为单位的当前时间,可以用来测试程序运行的效率
*   public static long currentTimeMillis()
*   2.将数组中指定的数据拷贝到另一个数组中
*   public static void arraycopy(Object src,int srcPos,int destPos,int length)
*       src - 源数组
*       srcPos - 源数组中的起始位置
*       dest - 目标数组
*       destPos - 目标数组中的起始位置
*       length - 要复制的数组元素的数量
*
* */
public class System_Class {
    public static void main(String[] args) {
        demo01();
        System.out.println("------------------------------------");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        demo02(array1,array2);
    }

    /*
    * 把src数组中的前3个元素，复制到dest数组的前3个位置上
    * 复制前：src中的元素[1,2,3,4,5],dest数组元素:[6,7,8,9,10]
    * 复制元素后： src：[1,2,3,4,5]    dest: [1,2,3,9,10]
    * */
    private static void demo02(int[] src,int[] dest) {
        System.out.println("复制前;");
        System.out.println("src:  " + Arrays.toString(src));
        System.out.println("dest:  " + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后：");
        System.out.println("src:  " + Arrays.toString(src));
        System.out.println("dest:  " + Arrays.toString(dest));
    }

    /*
    * 验证程序的执行效率，
    * 验证for循环打印数字1-9999所需要的时间（毫秒）
    * */
    private static void demo01() {
//        程序执行前，获取一次毫秒值
        long before = System.currentTimeMillis();
//        执行for循环
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
//        程序执行后，再获取一次毫秒值
        long after = System.currentTimeMillis();
        System.out.println("程序共耗时：  " + (after - before) + " 毫秒。");
    }
}

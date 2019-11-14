package cn.edu.henau.WrapperClass;

import java.util.ArrayList;

/*
*   自动装箱和自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
* */
public class Demo_02_AutoBoxingUnboxing {
    public static void main(String[] args) {
        /*
        *   自动装箱;直接把int类型的整数赋值包装类
        *   Integer in = 1； 等同于 Integer in = new Integer（1）；
        *
        *   自动拆箱：包装类不可直接参与运算，但是可以自动转换为基本数据类型，进行计算
        *   in + 2;相当于 in.intValue() + 2;
        * */

        ArrayList<Integer> list = new ArrayList<>();
        /*
        * ArrayList集合不能直接存储整数，可以存储Integer包装类
        * */
//        自动装箱，将int类型的数值自动转换为Integer类
        list.add(1);
//        自动拆箱，右值实际相当于 list.get(0),intValue
        Integer i = list.get(0);
        System.out.println(i);
    }
}

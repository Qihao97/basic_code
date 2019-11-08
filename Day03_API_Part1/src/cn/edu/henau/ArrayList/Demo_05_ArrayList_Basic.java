package cn.edu.henau.ArrayList;

import java.util.ArrayList;

/*
* 泛型只能存储引用类型，不能够存储基本类型
* 如果要是用基本类型，就要用基本类型的包装类，即装箱操作
* 基本类型      包装类（引用类型，位于java.lang包下）
* byte          Byte
* short         Short
* int           Integer
* long          Long
* float         Float
* double        Double
* char          Character
* boolean       Boolean
*
* 从JDK 1.5开始，java支持自动装箱，自动拆箱。
* 自动装箱： 基本类型-->包装类型
* 自动拆箱： 包装类型-->基本类型
* */
public class Demo_05_ArrayList_Basic {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

//        int类型的ArrayList要使用int的包装类Integer类
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        System.out.println(intList);

        int num = intList.get(1);
        System.out.println("第一号元素是: " + num);
    }
}

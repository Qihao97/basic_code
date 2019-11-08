package cn.edu.henau.ArrayList;

import java.util.ArrayList;

/*
* 数组的长度不能够发生改变，
* 但是ArrayList的长度是可以随意变化的。
*
* 对于ArrayList来说，<e>代表泛型
* 泛型：装在集合中的所有元素都是统一的类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 1.对于ArrayList来说，直接打印得到的不是地址值，而是内容;
* 2.如果内容为空，得到的将是空的[]
* */
public class Demo_03_ArrayList {
    public static void main(String[] args) {
//        创建了一个ArrayList集合，集合名称为list，里面全是String类型的数据
//        JDK1.8开始，右侧的尖括号里可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

//        向集合中添加数据，用到对的是ArrayList的add方法
        list.add("Marry");
        System.out.println(list);

        list.add("Jack");
        list.add("Black");
        list.add("White");
        list.add("Tom");
        System.out.println(list);
    }
}

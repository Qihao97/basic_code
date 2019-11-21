package cn.edu.henau.generic.generic_define_use;

/**
 * Author: Qihao
 * Date: 2019/11/21  17:33
 * Content:
 */
public class Demo_Generic {
    public static void main(String[] args) {
//        不写泛型默认为Object类型
        Generic gc = new Generic();
        gc.setName("农业物联网");
        Object name = gc.getName();
        System.out.println(name);

//        创建Generic对象,泛型使用Integer类型
        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setName(7979789);
        Integer name1 = integerGeneric.getName();
        System.out.println(name1);
        System.out.println(integerGeneric.getName());
        System.out.println("---------华丽的分割线-----------");

//        创建Generic对象,泛型使用String类型
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.setName("盖伦");
        String name2 = stringGeneric.getName();
        System.out.println(name2);
    }
}

package cn.edu.henau.day04Array;
/*
* 直接打印数组名称，得到的是数组对应的内存地址哈希值
*
*使用动态初始化的时候，其中的元素有默认值
* 1.整型：0
* 2.浮点型：0.0
* 3.字符型：'\u0000'
* 3.bool:false;
* 4.引用类型：null
*
* 静态初始化也有默认值的过程，只是系统会马上将默认值替换为大括号中的具体数值
* */
public class Demo2Array {
    public static void main(String[] args) {
//        打印数组名称
        int[] arrayInt = new int[5];
        arrayInt = new int[]{1,2,3,4,5};
//        输出arrayInt数组的内存地址值
        System.out.println(arrayInt);
//        输出arrayInt数组的内存地址值
        System.out.println(arrayInt.toString());


    }
}

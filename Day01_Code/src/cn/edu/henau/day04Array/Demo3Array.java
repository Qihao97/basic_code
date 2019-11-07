package cn.edu.henau.day04Array;
/*
* 使用 数组名称.length方法获取数组的长度
* 返回值是一个int数字，代表数组的长度
* 数组长度在程序运行期间不可改变
* */
public class Demo3Array {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int lenA = arrayA.length;
        int lenB = arrayB.length;

        System.out.println(lenA);
        System.out.println(lenB);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}

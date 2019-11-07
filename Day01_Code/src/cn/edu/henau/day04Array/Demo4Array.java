package cn.edu.henau.day04Array;
/*
* 求数组中的最大最小值
* */
public class Demo4Array {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{2,5,6,2,1,1,12,3,4,5,9,8,6,5,4,3,2,2,5,76,43,26,76,79,43,32,12,14,56,78,876,567,443,367,77,6,54,434,456,321,786,754,432,653};
        int max = arrayInt[0];

//        求数组最大值
        for (int i = 0; i < arrayInt.length; i++) {
            if (max < arrayInt[i]){
                max = arrayInt[i];
            }
        }
        System.out.println("max = " + max);

//        求最小值
        int min = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (min > arrayInt[i]){
                min = arrayInt[i];
            }
        }
        System.out.println("min = " + min);
    }
}

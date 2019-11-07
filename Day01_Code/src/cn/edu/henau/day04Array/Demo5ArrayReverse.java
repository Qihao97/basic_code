package cn.edu.henau.day04Array;
/*
* 数组元素翻转,即对称位置的元素交换
* */
public class Demo5ArrayReverse {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("原数组：");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "\t");
        }
        System.out.println();

        for (int min = 0,max = arrayInt.length - 1;min < max;min ++ ,max --){
            int temp = arrayInt[min];
            arrayInt[min] = arrayInt[max];
            arrayInt[max] = temp;
        }

        System.out.println("反转后的数组：");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "\t");
        }
        System.out.println();
    }
}

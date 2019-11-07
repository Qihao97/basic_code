package cn.edu.henau.day04Array;
/*
* 1.数组作为参数，传递的是地址值
* 2.一个方法的返回值只能有一个，当需要多个数据的时候，可以使用数组作为返回值。
* */
public class Demo6ArrayMethod {
    public static void main(String[] args) {
        System.out.println("数组作为形参：");
        int[] arrayInt = new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arrayInt);
        System.out.println("数组作为返回值：");
        int[] result = caculate(36,89,66);
        System.out.println("sum = " + result[0]);
        System.out.println("avg = " + result[1]);
    }

//    数组作为返回值
    public static int[] caculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] result = new int[]{sum,avg};
        return result;
    }

//    数组作为形参，传递一个地址值
    public static void printArray(int[] array){
        System.out.println("遍历数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}

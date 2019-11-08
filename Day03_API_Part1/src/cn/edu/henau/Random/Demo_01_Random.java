package cn.edu.henau.Random;

import java.util.Random;

/*
* Random类用来生成随机数
*
* 获取一个随机的int数字
* */
public class Demo_01_Random {
    public static void main(String[] args) {
        Random r = new Random();

//       范围为整个int的取值范围，包含正数和负数
        int num = r.nextInt();
        System.out.println("随机数是： " + num);

//        获取一个随机数，取值范围是[0,5)
        int num2 = r.nextInt(5);
        System.out.println(num2);

//        获取30个随机数，取值范围[0,5)
        int[] arrayInt = new int[30];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = r.nextInt(5);
            System.out.print(arrayInt[i] + "\t");
        }
    }
}

package cn.edu.henau.Scanner;

import java.util.Scanner;

/*
* 键盘输入若干个数字，求出其中的最大值
* */
public class Demo_02_Scanner_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[800];
        int a = 0,i = 0;
        while(sc.hasNextInt()){
            arrayInt[i] = sc.nextInt();
            i ++;
        }

        arrayInt[i + 1] = '\0';


//        输入的数组是：
        System.out.println("输入的数组是:");
        for (int i1 = 0; i1 < arrayInt.length; i1++) {
            System.out.print(arrayInt[i1] + "\t");
        }
        System.out.println();
        System.out.println("This array's length is:" + arrayInt.length);
    }
}

package cn.edu.henau.day04Array;
/*
* 数组：一种容器，可以同时存放多个数据值
*
* 数组的特点：
* 1.数组是一种引用数据类型
* 2.数组当中的多个数据值，类型必须统一
* 3.数组的长度在程序运行期间不能够改变
*
* 两种常见的初始化方式：
* 1.动态初始化（指定长度）
* 2.静态初始化（指定内容）
*
* 动态数组初始化的格式：
* 数据类型[]  数组名称 = new 数据类型[数组长度];
* 含义：
* 左侧数据类型：数组中内容的数据类型
* 左侧中括号：代表定义一个数组
* 左侧数组名称：给数组取一个名字
* 右侧的 new：代表创建数组的动作
* 右侧的数据类型必须额左边的数据类型保持一致
* 右侧的中括号里的数值，表示数组的长度，即数组可以保存多少数据，为int类型表达式
*
* 静态初始化：
* 基本格式：
* 数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，元素3，……};
* 省略格式：
* 数据类型[] 数组名称 = {元素1，元素2，元素3，……};
* 静态初始化一旦使用省略格式，就不能够查分为两个步骤了
*
* */
public class Demo01Array {
    public static void main(String[] args) {
//        动态初始化
        int [] arrayInt = new int[300];

        double [] arrayDouble = new double[200];

        String [] arrayString = new String[90];

//        静态初始化
        int[] arrayA = new int[]{5,15,25};

        String[] arrayStr = new String[]{"Hello", "World", "Java"};

        for (int j:arrayInt
             ) {
            System.out.println(j);
        }

        for (int i:arrayA
             ) {
            System.out.println(i);
        }

        for (String s : arrayStr
             ) {
            System.out.println(s);
        }

//        省略格式的 静态 初始化
        int[] arrayqqq = {1,2,3,4,5,6,7,8,9};
        int[] arrayaaa;
        arrayaaa = new int[] {2,2,2,2,2,2};

        for (int x:arrayaaa
             ) {
            System.out.println(x);
        }

//        动态初始化可以分为两个步骤
        int[] arrayInttt;
        arrayInttt = new int[5];
    }
}

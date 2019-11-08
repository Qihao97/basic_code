package cn.edu.henau.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
* ArrayList作为方法的返回值
* 题目：
* 用一个大集合存入20个数字，然后筛选其中的偶数元素，放到小集合中去
* 使用自定义方法
*
* 1.大集合，Integer类型
* 2.随机数 Random nextInt
* 3.筛选方法：
*   返回值类型： ArrayList
*   方法名： getSamllList
*   参数列表： ArrayList
* 5.判断是否为偶数： num % 2 == 0
* */
public class Demo_08_ArrayList_Return {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            intList.add(r.nextInt(100) + 1);
        }
        System.out.println("随机数组为: " + intList);

        ArrayList<Integer> smallList = getSmallList(intList);
        System.out.println("偶数总共有 " + smallList.size() + "个\n" + "偶数数组为： " + smallList);
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallIntList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 ==0){
                smallIntList.add(list.get(i));
            }
        }
        return smallIntList;
    }
}

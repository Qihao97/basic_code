package cn.edu.henau.ArrayList;

import java.util.ArrayList;

/*
* 按照指定格式遍历集合字符串：
* 题目：
* 定义以指定格式打印集合的方法（ArrayList类型作为参数),使用{}括起集合，使用@分隔每个元素。
* 格式参照{元素@元素@元素}
*
* 集合作为参数，传递的是地址值
* */
public class Demo_07_ArrayList_Print {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("梁山伯");
        strList.add("祝英台");
        strList.add("焦仲卿");
        strList.add("刘兰芝");
        strList.add("钱钟书");
        strList.add("杨绛");
        System.out.println(strList);

        arrayListPrint(strList);
    }

    public static void arrayListPrint(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}

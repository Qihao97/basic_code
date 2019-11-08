package cn.edu.henau.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个1-33之间的随机整数，添加到集合，并遍历集合
*
* 思路：
* 1.需要存储6个数字，创建一个集合，<Integer>
* 2.产生随机数，需要用到Random
* 3.循环6次，调用Random
* 4.使用add方法，将随机数添加到集合中
* 5.遍历集合
* */
public class Demo_06_ArrayList_Random {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            intList.add(r.nextInt(33) + 1);
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + "\t");
        }
        System.out.println();

    }
}

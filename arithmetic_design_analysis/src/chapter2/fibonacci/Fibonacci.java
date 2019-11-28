package chapter2.fibonacci;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Author: Qihao
 * Date: 2019/11/28  9:56
 * Content:
 * 斐波那契数列
 */
public class Fibonacci {
//    递归求解斐波那契数列
    HashMap<Integer,Integer> map = new HashMap<>();
    public int fibonacci(int n){
        int f1 = 1;
        int f2 = 1;
        int f = 1;
        if (n < 1){
            System.out.println("输入参数错误,程序终止!");
        }else if (n <= 2){
            map.put(1,f1);
            map.put(2,f2);
            return f;
        }else{
            f = fibonacci(n - 1) + fibonacci(n - 2);
            map.put(n,f);
            return f;
        }
        return 0;
    }
}

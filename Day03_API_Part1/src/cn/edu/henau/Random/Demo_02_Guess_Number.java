package cn.edu.henau.Random;

import java.util.Random;
import java.util.Scanner;

/*
* 猜数字小游戏
*
* 1.产生一个随机数
* 2.键盘输入用户猜的数字
* 3.判断用户猜的数字对不对
* */
public class Demo_02_Guess_Number {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您猜的数字:");
        int guessNum = sc.nextInt();
        if (guessNum == randomNum){
            System.out.println("牛批，一次就猜对了！");
        }else{
            System.out.println("一次没猜对，还能再猜:");
            while (true){
                guessNum = sc.nextInt();
                if (guessNum > randomNum){
                    System.out.println("大了，再猜一次：");
                }else if(guessNum < randomNum){
                    System.out.println("小了，重新猜:");
                }else{
                    System.out.println("您终于猜对了！");
                    break;
                }
            }
        }

    }
}

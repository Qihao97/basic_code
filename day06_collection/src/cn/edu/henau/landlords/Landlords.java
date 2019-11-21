package cn.edu.henau.landlords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:58
 * Content:
 * 斗地主案例:
 * 1.准备牌:
 *     特殊:大王小王
 *     其他52张牌:
 *        定义一个 数组/集合 ,存储4种花色
 *        定义一个 数组/集合 ,存储13个序号
 *   循环遍历两个 数组/集合 ,组装52张牌
 * 2.洗牌
 *   使用集合工具类,Collections的方法
 *   static void shuffle(List<?> list) 使用指定的随机源对指定列表进行置换
 *   会随机的打乱集合中元素的顺序
 * 3.发牌
 *   要求:每人17张牌,剩余的三张牌作为底牌,一人一张轮流发牌 , 集合的索引 (0~51)% 3
 *   定义4个集合,存储三个玩家的牌,和三张底牌
 *   索引 % 2 有两个值(0,1)
 *   索引 % 3 有三个值(0,1,2)
 *   索引 >= 51 给底牌发牌
 * 4.看牌
 *   直接打印集合,遍历存储玩家和底牌的集合
 */
public class Landlords {
    public static void main(String[] args) {
//        1.准备牌
        ArrayList<String> poker = new ArrayList<>();
//        定义两个数组,,一个存储花色,另一个存储序号
        String[] colors = {"♠","♣","♥","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
//        将大小王存储到poker集合中去
        poker.add("大王");
        poker.add("小王");
//        循环嵌套遍历两个数组,组装52张牌
        for (String num :
                numbers) {
            for (String color : colors) {
                System.out.println(color + num);
//                把组装好的牌存储到poker集合中去
                poker.add(color + num);
            }
        }
        System.out.println("-------------华丽的分割线---------------");
        System.out.println(poker);

//        2.洗牌
        Collections.shuffle(poker);
        System.out.println("-------------华丽的分割线---------------");
        System.out.println(poker);
        System.out.println("-------------华丽的分割线---------------");


//        3.发牌
//        定义4个集合,存储玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
//        使用poker的索引 % 3 来给3个玩家轮流发牌
        for (int i = 0; i < poker.size(); i++) {
//            获取每一张牌
            String p = poker.get(i);
//            轮流发牌
            if (i >= 51){
                diPai.add(p);
            }else if (i % 3 == 0){
//                给玩家1发牌
                player1.add(p);
            }else if (i % 3 == 1){
//                给玩家2发牌
                player2.add(p);
            }else if (i % 3 == 2){
//                给玩家3发牌
                player3.add(p);
            }
        }
//        4.看牌
        System.out.println("刘德华: " + player1);
        System.out.println("周润发: " + player2);
        System.out.println("周星驰: " + player3);
        System.out.println("底牌: " + diPai);
    }
}

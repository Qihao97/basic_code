package cn.edu.henau.Abstract.RedPackage;

import java.util.ArrayList;
import java.util.Random;

/*
* 群内普通成员的类
* */
public class Member extends User{
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> list){
//        从多个红包中随机抽取一个红包
//        随机获取一个 集合中的索引值来抽取红包
        int index = new Random().nextInt(list.size());
//        根据索引，获取元素的值后删除该位置的元素
        Integer delta = list.remove(index);
//        当前成员本来有好多钱
        int balance = super.getBalance();
//        收红包后的余额：
        balance += delta;
        super.setBalance(balance);
    }
}

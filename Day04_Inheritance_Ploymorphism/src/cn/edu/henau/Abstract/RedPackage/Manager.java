package cn.edu.henau.Abstract.RedPackage;

import java.util.ArrayList;

/*
* 群主类
* */
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
//        首先需要一个集合，用以存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

//        首先看一下群主有好多钱
        int leftMoney = super.getBalance();
        if (totalMoney > leftMoney){
            System.out.println("Insufficient balance!");
            return redList;
        }else{
//            从群主的余额里扣钱
            super.setBalance(leftMoney - totalMoney);
//            红包需要平均拆分为count份
            int avg = totalMoney / count;
            int mod = totalMoney % count;       //余数

//            最后的零头，放在最后一个红包中
//            将红包一个个放进集合中
            for (int i = 0; i < count - 1; i++) {
                redList.add(avg);
            }

//            最后一个红包
            int last = avg + mod;
            redList.add(last);
        }
        return redList;
    }
}

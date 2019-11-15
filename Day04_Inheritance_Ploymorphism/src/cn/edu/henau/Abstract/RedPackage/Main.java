package cn.edu.henau.Abstract.RedPackage;

import java.util.ArrayList;

/*
* 主方法
* */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 100);
        Member member1 = new Member("Member1", 100);
        Member member2 = new Member("Member2", 100);
        Member member3 = new Member("Member3", 100);

        System.out.println("发红包之前每个人的余额：");
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("*************华丽的分割线**************");

//        发红包，20元，发三份
        ArrayList<Integer> redList = manager.send(20, 3);

//        收红包
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        System.out.println("发红包之后每个人的余额：");
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}

package cn.edu.henau.inner_class.member_class;

/**
 * Created by Qihao on 2019/11/17 21:48
 * 主方法
 */
public class Demo_Main {
    public static void main(String[] args) {
//        创建一个英雄角色
        Hero hero = new Hero("盖伦", 200,new Weapon("大宝剑,多兰剑"));
        hero.attack();

        Hero 刘备 = new Hero("刘备", 35, new Weapon("AK-47"));
        刘备.attack();
    }
}

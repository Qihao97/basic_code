package cn.edu.henau.polymorphism.member_variable;

/**
 * Created by Qihao on 2019/11/16 8:43
 *
 * 访问成员变量的两种方式：
 * 1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有就向上找
 * 2.间接通过成员方法访问: 看该方法属于谁，没有则向上找
 */
public class Main {
    public static void main(String[] args) {
//        使用多态的写法，父类引用指向子类对象
        Father s = new Son();
//        下面使用的是父类的num
        System.out.println(s.num);
        System.out.println("-----------------");

//        下面使用的是子类的num
        System.out.println(((Son) s).num);

        System.out.println("----------华丽的分割线----------");
//        子类没有覆盖重写，就是父类的方法，子类如果覆盖重写，就是子类的方法
        s.showNum();
    }
}

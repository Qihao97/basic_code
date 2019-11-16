package cn.edu.henau.polymorphism.muti_method;

/**
 * Created by Qihao on 2019/11/16 9:13
 *
 * 在多态的代码中，成员方法的访问规则是：
 *      看new的是谁，就优先使用谁，没有就向上找
 *
 * 口诀：
 * 成员方法：编译看左边，运行看右边，成员变量不在此列
 * 成员变量：编译看右边，运行看左边
 */
public class Main {
    public static void main(String[] args) {
        Base_Class derived = new Derived_Class();

//        子类重写的方法，优先使用子类的
        derived.method();
//        子类没有该方法，向上找，使用父类的
        derived.methodBase();
    }
}

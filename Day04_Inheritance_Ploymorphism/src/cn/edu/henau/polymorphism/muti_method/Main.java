package cn.edu.henau.polymorphism.muti_method;

/**
 * Created by Qihao on 2019/11/16 9:13
 *
 * 在多态的代码中，成员方法的访问规则是：
 *      看new的是谁，就优先使用谁，没有就向上找
 */
public class Main {
    public static void main(String[] args) {
        Base_Class derived = new Derived_Class();

        derived.method();
        derived.methodBase();
    }
}

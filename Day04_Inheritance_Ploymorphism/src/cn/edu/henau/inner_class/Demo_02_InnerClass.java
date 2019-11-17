package cn.edu.henau.inner_class;

/**
 * Created by Qihao on 2019/11/16 19:10
 */
public class Demo_02_InnerClass {
    public static void main(String[] args) {
//        外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}

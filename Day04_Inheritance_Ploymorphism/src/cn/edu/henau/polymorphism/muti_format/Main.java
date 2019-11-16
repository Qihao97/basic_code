package cn.edu.henau.polymorphism.muti_format;

/**
 * Created by Qihao on 2019/11/16 8:38
 */
public class Main {
    public static void main(String[] args) {
//       使用多台的写法
//        左侧父类的引用，指向了右侧子类的对象
        Father s = new Son();
        s.method();
        s.methodF();
    }
}

package cn.edu.henau.StringBuilder;

/*
* StringBuilder的toString成员方法
*     StringBuilder和String之间可以相互转换
*     String --> StringBuilder 使用StringBuilder的构造方法
*     StringBuilder --> String 使用StringBuilder的toString方法
* */
public class Demo_02_StringBuilder_toString {
    public static void main(String[] args) {
//        String --> StringBuilder
        String str = "Hello!";
        System.out.println("str:  " + str);
        StringBuilder sb = new StringBuilder(str);
        sb.append("World!");
        System.out.println("sb is :  " + sb);
//        StringBuilder --> String,使用toString方法
        String s = sb.toString();
        System.out.println("sb3 toString is :   " + s);
    }
}

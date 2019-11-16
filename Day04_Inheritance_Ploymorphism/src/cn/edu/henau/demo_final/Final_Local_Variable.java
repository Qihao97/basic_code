package cn.edu.henau.demo_final;

/**
 * Created by Qihao on 2019/11/16 14:46
 *
 * 用final来修饰局部变量实例
 */
public class Final_Local_Variable {
    public static void main(String[] args) {
        int num1 = 100;
        System.out.println(num1);
        num1 = 200;
        System.out.println(num1);

//        用final来修饰局部变量，该变量就成了常量，其值不可更改，“一次赋值，终生不变”
        final int num2 = 300;
        System.out.println(num2);
//        num2 = 600;  //不能更改

//        正确写法，只要保证只有一次赋值即可
        final int num3;
        num3 = 900;

//        对于基本类型来说，不可变指的是变量当中的数值不可变
//        对于引用类型来说，不可变指的是变量当中的地址值不可变
    }
}

package cn.edu.henau.inner_class.inner_final;

/**
 * Created by Qihao on 2019/11/17 10:33
 * 局部内部类，如果想访问所在方法的 局部变量，那么这个局部变量必须是 有效final的
 * 原因:
 * 1.new出来的对象是在堆内存中
 * 2.局部变量是跟着方法走的，在栈内存中
 * 3.方法运行结束后，立刻出栈，局部变量即立刻消失
 * 4.new出来的对象会在堆内存中持续存在，直到垃圾回收消失。
 */
public class MyOut {
    public void methodOuter(){
        int num = 100;
//        num = 90;     //要么写上final，要么省略，但要保证其事实上不变，即只有一次赋值
        System.out.println("Outer类的methodOuter方法被调用!");

        class MyInner{
            public void methodInner(){
                System.out.println(num);
                System.out.println("Inner类的methodInner方法被调用!");
            }
        }
    }
}

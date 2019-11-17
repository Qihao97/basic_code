package cn.edu.henau.inner_class;

/**
 * Created by Qihao on 2019/11/16 19:04
 * 解决内部类外部类成员变量重名问题
 * 格式是：
 *     外部类名称.this.外部类成员变量名
 */
public class Outer {

    int num = 10;

    public class Inner{

        int num = 20;

        public void methodInner(){
            int num = 30;   //内部方法的局部变量
            System.out.println(num);      //局部变量
            System.out.println(this.num); //打印内部类成员变量
            System.out.println(Outer.this.num); //打印外部类成员变量
        }
    }
}

package cn.edu.henau.generic.generic_method;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:05
 * Content:
 */
public class Generic_Main {
    public static void main(String[] args) {
//        创建一个对象
        Generic_Class generic_class = new Generic_Class();

        /**
         * 调用含有泛型的方法method
         * 传递什么类型,泛型就是什么类型
         * */
        generic_class.method1(12);
        generic_class.method1("thon");

        Generic_Class.method02("dksjdkjfkjdfjsdkjkjfdsfdskj");

//        静态方法可以通过 类名.方法名 来调用
    }
}

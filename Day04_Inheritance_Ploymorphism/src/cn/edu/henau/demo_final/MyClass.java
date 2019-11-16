package cn.edu.henau.demo_final;

/**
 * Created by Qihao on 2019/11/16 14:29
 * 当final关键字用来修饰一个类的时候
 * 格式：
 *     public final class 类名称{
 *         ...
 *     }
 *     含义：当前这个类不能有任何子类来继承它。（太监类）
 *     注意：一个类如果是final的，其中的所有方法都不能被覆盖重写，因为没有子类
 */
public final class MyClass {
    public void method(){
        System.out.println("method方法被执行!");
    }
}

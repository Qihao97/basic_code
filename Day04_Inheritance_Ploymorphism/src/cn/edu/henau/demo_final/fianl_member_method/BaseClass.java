package cn.edu.henau.demo_final.fianl_member_method;

/**
 * Created by Qihao on 2019/11/16 14:37
 * 当final关键字来修饰一个方法的时候，此方法即最终方法，不能被覆盖重写
 * 格式：
 *     修饰符 final 返回值类型 方法名称(参数列表){
 *         方法体
 *     }
 *
 *     注意事项：
 *          对于类、方法来说，abstract关键字和final关键字不能够同时使用，因为矛盾。
 *          抽象的类需要被一个类继承并实现其中的抽象方法
 *          抽象的方法需要被子类覆盖重写
 *          但是有了final后，类不能够被继承，方法不能够被覆盖重写，所以矛盾
 */
public class BaseClass {
    public void method(){
        System.out.println("父类方法执行!");
    }
}

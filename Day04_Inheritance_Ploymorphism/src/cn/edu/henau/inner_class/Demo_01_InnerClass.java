package cn.edu.henau.inner_class;

/**
 * Created by Qihao on 2019/11/16 18:16
 * 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
 * 例如：身体与心脏，汽车和发动机
 *
 * 分类：
 *     1.成员内部类
 *     2.局部内部类（包含匿名内部类）
 *
 *  成员内部类的定义格式：
 *      修饰符 class 外部类名称{
 *          修饰符 class 内部类名称{
 *              ...
 *          }
 *          ...
 *      }
 *  注意：内用外，随意
 *        外用内，需要借助内部类对象
 *
 *  如何使用内部类：
 *      1.间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
 *      2.直接使用：公式; 外.内
 *          类名称 对象名 = new 类名称();
 *          外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 *
 */
public class Demo_01_InnerClass {
    public static void main(String[] args) {
//        外部类的对象
        Body jack = new Body("Jack");
//        通过外部类的对象调用外部类的方法，间接使用内部类
        jack.methodBody();
        System.out.println("----*****---华丽的分割线---*****----");
//        按照公式来创建内部类的对象
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}

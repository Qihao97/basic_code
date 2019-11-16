package cn.edu.henau.polymorphism.animal;

/**
 * Created by Qihao on 2019/11/16 10:08
 *
 * 对象的向上转型，其实就是多态写法：
 *  格式;父类名称 对象名 = new 子类名称();
 *  含义：右侧创建一个子类对象，把它当做父类来看待使用
 *  注意事项：向上转型一定是安全的，从小范围转向了大范围
 *            但是一旦向上转型为父类，就无法调用子类特有的内容了
 *            此时要使用子类的特有内容，就需要再向下转型
 *
 * 对象的向下转型，其实是一个还原的动作
 *     格式：子类名称 对象名 = （子类名称）父类对象;
 *     可理解为引用类型的强制类型转换
 *     含义：将父类对象还原为子类的对象
 *  注意事项：
 *     a.必须保证对象创建时是该子类，才能够向下转型为该子类对象
 *     b.否则报错
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        ((Cat) animal).catchMouse();

        /**
        * 下面是错误的转型，new的时候是猫，现在转为狗，编译不会报错，但是在运行的时候会报错
         * java.lang.ClassCastException  类转换异常
        * */
        Dog dog = (Dog) animal;
        dog.eat();
    }
}

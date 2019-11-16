package cn.edu.henau.polymorphism.instance_of;

import cn.edu.henau.polymorphism.animal.*;

/**
 * Created by Qihao on 2019/11/16 10:34
 *
 * 如何才能够知道一个父类的引用对象本来是什么子类
 *  使用instanceof关键字
 *  格式:
 *      对象 instanceof 类型
 *      这将得到一个boolean值结果，即判断前面的对象能不能做后面类型的实例
 *
 *  Summarize:
 *      向上转型是安全的，向下转型一定要进行instanceof判断，否则可能会出现类转换异常
 */
public class Demo_01_Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

//        如果希望调用子类特有的方法，就需要向下转型
//        判断animal是否由Dog类的对象转换而来
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }

//        判断animal是否由Cat类的对象转换而来
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        System.out.println("-----------华丽的分割线-----------");
        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog )animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}

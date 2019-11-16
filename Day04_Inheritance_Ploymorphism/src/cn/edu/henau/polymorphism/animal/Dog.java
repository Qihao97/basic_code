package cn.edu.henau.polymorphism.animal;

/**
 * Created by Qihao on 2019/11/16 10:25
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头!");
    }

    public void watchHouse(){
        System.out.println("看家的狗狗!");
    }
}

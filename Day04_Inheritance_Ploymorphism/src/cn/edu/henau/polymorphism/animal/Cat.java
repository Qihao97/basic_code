package cn.edu.henau.polymorphism.animal;

/**
 * Created by Qihao on 2019/11/16 10:07
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat fish!");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠!");
    }
}

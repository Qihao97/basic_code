package cn.edu.henau.This;

/*
* 子类
* */
public class This_Son_Class extends This_Father_Class{
    private int num = 8988;

    public This_Son_Class() {
        System.out.println("子类的无参构造方法被调用！");
    }

    public This_Son_Class(int num) {
        this();
        this.num = num;
        System.out.println("子类的含参构造方法被调用！");
    }

    public void printNum(){
        System.out.println("子类的num值是：  " + this.num);
    }

    public void printFatherNum(){
        System.out.println("子类访问父类的num值:");
        super.printNum();
    }

    public void methodSon(){
        this.printFatherNum();
        System.out.println("子类的methodSon方法被调用！");
    }
}

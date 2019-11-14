package cn.edu.henau.Inheritancde.Super;

/*
* 测试父类
* */
public class Super_Father {
    int num = 10;

    public void methodFather(){
        System.out.println("methodFather be executed!");
    }

    public Super_Father(int num) {
        this.num = num;
        System.out.println("父类的含参构造方法被调用！");
    }

    public Super_Father() {
        System.out.println("父类的无参构造方法被调用！");
    }

    public void method(){
        System.out.println("Father's method be executed!");
    }
}

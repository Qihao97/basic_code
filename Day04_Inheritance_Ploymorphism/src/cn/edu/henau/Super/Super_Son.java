package cn.edu.henau.Super;

/*
* 测试子类
* */
public class Super_Son extends Super_Father{
    int num = 100;

    public void methodSon(){
        System.out.println("methodSon be executed!");
        System.out.println("Father's num = " + super.num);
    }

    @Override
    public void method() {
        super.method();

    }

    public Super_Son() {
        System.out.println("子类的无参构造方法被调用！");
    }

    public Super_Son(int num, int num1) {
        super(num);
        this.num = num1;
        System.out.println("子类的含参构造方法被调用！");
    }
}

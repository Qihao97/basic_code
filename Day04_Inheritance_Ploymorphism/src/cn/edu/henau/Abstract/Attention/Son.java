package cn.edu.henau.Abstract.Attention;

/*
* 测试子类
* */
public class Son extends Father {
    public Son(){
        System.out.println("子类的构造方法被执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭。。");
    }

    @Override
    public void speak() {
        System.out.println("讲火星语。。");
    }
}

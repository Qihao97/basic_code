package cn.edu.henau.Inheritancde.Inheritance;

/*
* 子类，继承phone
* */
public class Test_New_Phone extends Test_Phone {
    @Override
    public void show() {
        //System.out.println("显示号码");
        //重复利用父类的方法，子类添加更多的内容
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}

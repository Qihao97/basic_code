package cn.edu.henau.Inheritancde.Override;

/*
重写（Override）：方法覆盖、覆写
    出现在继承关系中，方法的名称和参数列表都一样

重载（Overload）：
    方法名称一样，参数列表不一样

方法覆盖重写特点：创建的是子类对象，优先使用子类方法。

注意事项：
    1.必须保证父子类之间方法的名称相同，参数列表也相同；
    @Override: 写在重载方法前面，用来检测是不是有效的正确覆盖重写；
    这个注解不写也不影响，只要能够满足要求，也是正确的覆盖重写
    2.子类方法的返回值必须小于等于父类方法的返回值范围（返回值的类不能是父类中返回值的父类）
    前提：java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
    3.子类方法的权限，必须大于等于父类方法的权限修饰符
    public > protected > default > private
* */
public class Demo_01_Override {
    public static void main(String[] args) {
        Demo_Override_BasicClass basicClass = new Demo_Override_BasicClass();
        basicClass.method();


    }
}

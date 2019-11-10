package cn.edu.henau.Extends;

/*
* 继承的格式:
* 在继承关系中，子类可视为父类
* eg:父类是一个员工，子类是讲师，那么子类也可以视为一个员工
*
* 定义父类的格式：
*   与定义普通的类没有区别
* 定义子类的格式：
*   public class 子类名称 extends 父类名称{
*       //成员变量和方法
*   }
* */
public class Demo_01_Extends {
    public static void main(String[] args) {
        Teacher_Extends teacher = new Teacher_Extends();

//        Techer类继承了Employee类
        teacher.method();

        Assistant_Extends assistant = new Assistant_Extends();
        System.out.println("创建了一个Assistant对象：");
        assistant.method();
    }
}

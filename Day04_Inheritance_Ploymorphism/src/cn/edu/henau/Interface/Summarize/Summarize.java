package cn.edu.henau.Interface.Summarize;

/*
* 在Java 9+ 版本中，接口的内容可以有：
* 1.成员变量其实是常量，格式：
*   [public] [static] [final] 数据类型 常量名称 = 值；
*   注意：
*   该常量必须赋值，而且一旦赋值即不可改变，常量名完全大写，用下划线分隔
* 2.接口中最重要的就是抽象方法，格式：
*   [public] [abstract] 返回值类型 方法名称(参数列表);
*   注意：实现类必须覆盖重写接口所有的抽象方法，除非实现类是抽象类
* 3.从Java8开始接口里允许定义默认方法，格式：
*   [public] default 返回值类型 方法名称(参数列表){
*       方法体;
*   }
*   注意：默认方法也可以被覆盖重写
* 4.从Java8开始，接口里允许定义静态方法，格式：
*   [public] static 返回值类型 方法名称(参数列表){
*       方法体;
*   }
*   注意：应该通过接口名称进行调用，不能通过实现类对象调用接口静态方法
*
* 5.从Java 9开始，接口里允许定义私有方法，格式：
*   普通私有方法：private 返回值类型 方法名称（参数列表）{方法体}
*   静态私有方法：private static 返回值类型 方法名称（参数列表）{方法体}
*   注意：private的方法只有接口自己能够使用，不能被实现类使用
* */
public class Summarize {
}
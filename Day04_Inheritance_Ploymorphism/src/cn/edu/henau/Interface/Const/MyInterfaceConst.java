package cn.edu.henau.Interface.Const;

/*
* 接口中也可以定义“成员变量”，但是必须使用 public static final 三个关键字来修饰
* 实际上是接口的 常量
* 格式:
*   public static final 数据类型 常量名 = 值;
*
*   一旦使用final修饰，说明不可改变
*
* 注意事项：
*   1.接口当中的常量，可以省略 public static final,写不写都是这三个关键字修饰
*   2.接口中的常量必须赋值；
*   3.常量名所有字母大写多个单词用下划线分隔
* */
public interface MyInterfaceConst {
//    该成员变量实质上是一个常量，一旦赋值即不可更改
//    用final修饰的值，一定要手动赋值

    public static final int NUM_OF_MY_CLASS = 100;
}

package cn.edu.henau.day01;
/*
* 1.变量名不可重复
* 2.float和long类型的F和L不要丢掉
* 3.使用byte和short类型的变量，右侧数据不可超过左侧类型的范围
* 4.没有赋值的变量不能直接使用
* 5.变量使用不能超过作用域范围。
* 作用域：从定义变量开始，一直到直接所属的大括号结束为止。
* */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 = 30;
        System.out.println(num1);

        {
            int num2 = 300;
            System.out.println(num2);
        }

        int num2 = 400;
        System.out.println(num2);
    }
}

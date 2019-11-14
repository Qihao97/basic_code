package cn.edu.henau;

/*
* java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作
* 常用的方法：
*   1.返回以毫秒为单位的当前时间,可以用来测试程序运行的效率
*   public static long currentTimeMillis()
*   2.将数组中指定的数据拷贝到另一个数组中
*   public static void arraycopy(Object src,int srcPos,int destPos,int length)
*
* */
public class System_Class {
    public static void main(String[] args) {
        demo01();
    }

    /*
    * 验证程序的执行效率，
    * 验证for循环打印数字1-9999所需要的时间（毫秒）
    * */
    private static void demo01() {
//        程序执行前，获取一次毫秒值
        long before = System.currentTimeMillis();
//        执行for循环
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
//        程序执行后，再获取一次毫秒值
        long after = System.currentTimeMillis();
        System.out.println("程序共耗时：  " + (after - before) + " 毫秒。");
    }
}

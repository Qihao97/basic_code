package cn.edu.henau.inner_class.anonymous_inner_class;

/**
 * Created by Qihao on 2019/11/17 20:08
 * 如果接口的子类，或者是父类的子类，只需要使用一次
 * 在此情况下，推荐使用匿名内部类
 * 定义格式：
 *     接口名称  对象名  = new 接口名称(){
 *         //覆盖重写接口中所有的抽象方法
 *     };//注意末尾的分号
 *
 *   匿名内部类，格式解析
 *      new 接口名称（）{...}
 *      1.首先，new 代表创建对象的动作
 *      2.接口名称就是匿名内部类需要实现哪个接口
 *      3.{...}匿名内部类的内容
 *
 *      另外还要注意：
 *      1.匿名内部类在创建对象的时候，只能使用唯一的一次;
 *          如果希望多次创建对象,而且类的内容一样,那就需要单独定义实现类了
 *      2.匿名对象在调用方法的时候,只可以调用一次,如果需要调用多次,需要给对象一个名字.
 *          需要第二次调用方法的时候,需要再次创建一个匿名内部类的匿名对象
 *      3.匿名内部类是省略了 实现类 / 子类名称,但是匿名对象是省略了  对象名称
 *          强调匿名内部类和匿名对象不是一回事
 */
public class Demo_Main {
    public static void main(String[] args) {
        Myinterface impl = new MyinterfaceImpl();
        impl.method();
        System.out.println("------华丽的分割线--------");

//        使用匿名内部类,但不是匿名对象,对象名叫obj
        Myinterface obj = new Myinterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法!111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2!222");
            }
        };

//        使用了匿名内部类,而且省略了对象的名称,也是匿名对象
//        该匿名对象不能够二次调用成员方法,要再次调用的 时候,需要再创建一个
        new Myinterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法!111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法2!222");
            }
        }.method();

        obj.method();
    }
}

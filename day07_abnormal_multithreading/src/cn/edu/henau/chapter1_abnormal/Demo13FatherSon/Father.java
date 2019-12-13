package cn.edu.henau.chapter1_abnormal.Demo13FatherSon;

/**
 * Author: Qihao
 * Date: 2019/12/13  17:08
 * Content:
 * 子父类异常:
 *   如果父类抛出了多个异常,子类重写父类方法的时候,抛出和父类相同的异常或者是父类异常的子类,或者不抛出异常,
 *   父类方法没有抛出异常,子类重写父类该方法时也不可抛出异常.此时子类产生该异常,只能捕获处理,不能声明抛出
 *
 * 注意:
 *    父类异常是什么样子,子类异常就什么样
 */
public class Father {
    public void show01() throws NullPointerException,ClassCastException{

    }

    public void show02() throws IndexOutOfBoundsException{

    }

    public void show03() throws IndexOutOfBoundsException{

    }

    public void show04(){

    }
}

class Son extends Father{
//    子类在重写父类方法时,抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{
    }
//        子类重写父类方法时,抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{

    }

//    子类在重写父类方法的时候,也可以不抛出异常
    public void show03(){

    }

//    父类方法没有抛出异常,子类在重写父类方法的时候,也不能抛出异常
//    此时子类产生异常,不能声明抛出,只能够捕获处理
    public void show04(){
        try{
            throw  new Exception("编译期的异常.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

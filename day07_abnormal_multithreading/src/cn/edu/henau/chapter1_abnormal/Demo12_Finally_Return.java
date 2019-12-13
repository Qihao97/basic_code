package cn.edu.henau.chapter1_abnormal;

/**
 * Author: Qihao
 * Date: 2019/12/13  16:51
 * Content:
 * 如果finally有return语句,永远返回finally中的结果,应当避免该情况
 */
public class Demo12_Finally_Return {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

//    定义一个方法,返回变量a的值
    public static int getA(){
        int a = 10;
        try{

        }catch (Exception e){
            System.out.println(e);
        }finally{
//            finally里放的是一定会执行的代码
            a = 100;
            return a;
        }
    }
}

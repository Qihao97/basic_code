package cn.edu.henau.demo1class;
/*
* 对象作为方法的参数
* 实际传递的是地址值
* */
public class Demo05ObjectAsParameter {
    public static void main(String[] args) {
        Demo03_Phone phone = new Demo03_Phone("Apple",8500,"土豪金");
        method(phone);
    }

    public static void method(Demo03_Phone phone){
        System.out.println(phone.toString());
    }
}

package cn.edu.henau.demo1class;
/*
* 对象作为方法的返回值
* */
public class Demo06_Object_Return {
    public static void main(String[] args) {
        Demo03_Phone phone = new Demo03_Phone("Apple",9000,"Black");
        System.out.println(phone.toString());
        Demo03_Phone phone1 = getPhone();
        System.out.println(phone1.toString());
    }

    public static Demo03_Phone getPhone(){
        Demo03_Phone ph = new Demo03_Phone();
        ph.setBrand("Vivo");
        ph.setPrice(2000);
        ph.setColor("white");
        return ph;
    }
}

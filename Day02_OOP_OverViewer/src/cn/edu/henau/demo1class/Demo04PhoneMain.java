package cn.edu.henau.demo1class;

public class Demo04PhoneMain {
    public static void main(String[] args) {
        Demo03_Phone phone = new Demo03_Phone("MI",2300,"Black");
        System.out.println(phone.getBrand() + phone.getPrice() + phone.getColor());
        System.out.println(phone.toString());

        phone.setBrand("Huawei");
        System.out.println(phone.getBrand() + phone.getPrice() + phone.getColor());
        System.out.println(phone.toString());

        phone.call("贝尔");
        phone.sendMessage();
    }
}

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

        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
        Demo03_Phone phone1 = phone;
        phone1.setBrand("Apple");
        phone1.setPrice(8999);
        System.out.println("phone1:");
        System.out.println(phone1.toString());
        System.out.println("phone:");
        System.out.println(phone.toString());
    }
}

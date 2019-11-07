package cn.edu.henau.demo1class;

public class Demo03_Phone {
    private String brand;
    private double price;
    private String color;

    public void call(String who){
        System.out.println("给" + who + "打call ！");
    }

    public void sendMessage(){
        System.out.println("发短信！");
    }

    public Demo03_Phone() {
    }

    public Demo03_Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Demo03_Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

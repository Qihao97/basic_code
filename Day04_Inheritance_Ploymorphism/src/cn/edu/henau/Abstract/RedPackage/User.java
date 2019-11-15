package cn.edu.henau.Abstract.RedPackage;

/*
* 用户类，用户包含群主和普通的群成员
* */
public class User {
    private String name;    //姓名
    private int balance;    //余额

    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void show(){
        System.out.println("Name: " + this.name + "    Balance: " + this.balance);
    }
}

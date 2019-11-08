package cn.edu.henau.anonyObject;

/*
* 创建一个匿名人对象
* */
public class AnonymousPerson {
    private String name;

    public void showName(){
        System.out.println("My name is:" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnonymousPerson(String name) {

        this.name = name;
    }

    public AnonymousPerson() {

    }
}

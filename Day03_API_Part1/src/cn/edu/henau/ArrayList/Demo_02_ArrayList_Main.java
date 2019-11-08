package cn.edu.henau.ArrayList;

/*
* 创建对象数组
* */
public class Demo_02_ArrayList_Main {
    public static void main(String[] args) {
        Demo_01_ArrayList_Person[] person = new Demo_01_ArrayList_Person[3];
        person[0] = new Demo_01_ArrayList_Person("Jane",20);
        person[1] = new Demo_01_ArrayList_Person("Jack",21);
        person[2] = new Demo_01_ArrayList_Person("Tom",22);

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }
}

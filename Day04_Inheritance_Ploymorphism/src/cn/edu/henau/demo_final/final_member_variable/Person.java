package cn.edu.henau.demo_final.final_member_variable;

/**
 * Created by Qihao on 2019/11/16 15:12
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也是不可变的
 *
 * 1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值
 * 2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值,只能二选一
 *      如果使用构造方法赋值，必须保证所有的构造方法最终都能够给final成员变量赋值，
 *      而且，使用构造方法赋值后，该成员变量不能使用set方法
 */
public class Person {
    private String name;
    private final String nickname = "Jack";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

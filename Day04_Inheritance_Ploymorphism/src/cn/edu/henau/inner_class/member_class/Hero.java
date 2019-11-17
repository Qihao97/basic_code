package cn.edu.henau.inner_class.member_class;

/**
 * Created by Qihao on 2019/11/17 21:42
 * 游戏当中的影响角色类
 */
public class Hero {
//    String 本身也是一个类,因此,理论上类也可以做成员变量
    private String name;    // 英雄名字
    private int age;        //英雄的年龄
    private Weapon weapon;  //英雄的武器

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "正在使用" + weapon.getCode() + "攻击敌方!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

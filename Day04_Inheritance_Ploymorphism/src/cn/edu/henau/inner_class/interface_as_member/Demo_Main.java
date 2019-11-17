package cn.edu.henau.inner_class.interface_as_member;

/**
 * Created by Qihao on 2019/11/17 22:02
 */
public class Demo_Main {
    public static void main(String[] args) {
        Hero 后羿 = new Hero("后羿", new SkillImpl());
        后羿.attack();

//        对英雄的Skill接口,也可以使用匿名内部类来实现
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("嗖~~嗖~~嗖~~");
            }
        };
        Hero 艾希 = new Hero("艾希", skill);
        艾希.attack();

        后羿.setSkill(skill);
        后羿.attack();
    }
}

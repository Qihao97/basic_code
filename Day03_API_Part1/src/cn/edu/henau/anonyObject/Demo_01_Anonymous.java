package cn.edu.henau.anonyObject;

/*
* 注意事项：
* 匿名对象对象只能使用一次，下次再用不得不再创建一个新的对象
* 使用建议：
* 如果确定有一个对象只需要使用唯一的一次，即可使用匿名对象
* */
public class Demo_01_Anonymous {
    public static void main(String[] args) {
        AnonymousPerson person1 = new AnonymousPerson("Jone");
        person1.showName();
        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
        new AnonymousPerson("zhang").showName();
        new AnonymousPerson().setName("jjj");
    }
}

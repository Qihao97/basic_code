package cn.edu.henau.inner_class;

/**
 * Created by Qihao on 2019/11/16 18:34
 */
public class Body {

//    外部类的成员变量
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public void methodBody(){
//        外部类的方法
        System.out.println("外部类的方法!");
        System.out.println("我叫： " + name);
        new Heart().beat();
    }

//    成员内部类
    public class Heart{
        public void beat(){
//            内部类的方法
            System.out.println("心脏跳动，蹦蹦蹦!");
        }
    }
}

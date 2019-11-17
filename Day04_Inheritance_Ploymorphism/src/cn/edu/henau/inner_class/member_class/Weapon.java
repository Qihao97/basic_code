package cn.edu.henau.inner_class.member_class;

/**
 * Created by Qihao on 2019/11/17 21:44
 */
public class Weapon {
    private String code;  //武器的代号

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

package cn.edu.henau.permission_modifier;

/**
 * Created by Qihao on 2019/11/16 15:33
 * Java中有四种权限修饰符：
 *                public  >  protected  >  (default)  >  private
 * 同一个类：     yes         yes             yes          yes      我自己
 * 同一个包：     yes         yes             yes          no       我邻居
 * 不同包子类：   yes         yes             no           no       我儿子
 * 不同包非子类： yes         no              no           no       陌生人
 *
 * 注意事项：（default）是不写的意思
 */
public class Main {
}

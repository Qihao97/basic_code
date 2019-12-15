package cn.edu.henau.chapter1_abnormal;

import java.util.Scanner;

/**
 * Author: Qihao
 * Date: 2019/12/13  17:47
 * Content:
 * 要求:  模拟注册操作,如果用户名已经存在,就抛出异常并提示: 亲,该用户名已被注册
 *
 * 分析:
 *      1.使用数组,保存已经注册过的用户名(以后使用数据库)
 *      2.使用Scanner获取用户输入的注册用户名(前端,页面)
 *      3.定义一个方法,对用户输入的注册的用户名进行判断
 *          遍历存储已经注册过的用户名数组,获取每一个用户名
 *          使用获取到的用户名和用户输入的用户名比较(结果为true或者false,true,说明用户名已存在,抛出异常,false,继续遍历比较)
 *          如果循环结束了还没有找到用户名,则说明用户名没有重复,说明没有重复的,此时,可以提示用户,"恭喜您,可以注册"
 *
 */
public class Demo15Exercise {
//    step1: 使用一个字符串数组保存已经注册过的用户名(即数据库)
    static String[] userNames = {"张三","李四","王五"};
    public static void main(String[] args) {
//    step2: 使用Scanner来获取用户输入的注册用户名(最好用前端web页面)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String name = sc.nextLine();
    }

//    step3: 定义一个方法,对用户输入的注册用户名进行判断
    public static void checkUsername(String userName) throws Demo14RegisterException {
//        遍历存储已经注册过的用户名数组,获取每一个用户名
        for (String name : userNames) {
//            使用获取到的用户名和用户输入的用户名进行比较
            if (name.equals(userName)){
                throw new Demo14RegisterException("亲,该用户名已经被注册了.");
            }
        }

//        如果遍历结束还没有找到,提示用户"恭喜您,可以注册"
        System.out.println("恭喜您,可以注册!");
    }
}

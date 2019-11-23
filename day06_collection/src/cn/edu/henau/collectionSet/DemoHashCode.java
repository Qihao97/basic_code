package cn.edu.henau.collectionSet;

/**
 * Author: Qihao
 * Date: 2019/11/23  20:54
 * Content:
 * 哈希值: 是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到的地址,不是数据实际存放的物理地址值)
 * 在Object类中有一个方法,可以获取对象的哈希值
 * int HashCode() 返回该对象的哈希码值
 * hashCode方法的源码:
 *      public native int hashCode();
 *      native:代表该方法调用的是本地操作系统的方法
 *
 * String类的哈希值:
 *     String类重写了Object类的hashCode方法
 */
public class DemoHashCode {
    public static void main(String[] args) {
//        Student类继承了Object类,所以可以使用Object类的hashCode方法
        Student alice = new Student("Alice", 18, 18207100);
        System.out.println(alice);
        System.out.println(alice.hashCode());

        Student merry = new Student("Merry", 17, 18207102);
        System.out.println(merry);
        System.out.println(merry.hashCode());

        System.out.println("---------*****华丽的分割线*****----------");
        String s1 = new String("郑州");
        String s2 = new String("郑州");
        System.out.println("s1.hashCode:  " + s1.hashCode());
        System.out.println("s2.hashCode:  " + s2.hashCode());
        System.out.println("s1 equals s2?  " + s1.equals(s2));
        System.out.println("s1 == s2 ?  " + (s1 == s2));
    }
}

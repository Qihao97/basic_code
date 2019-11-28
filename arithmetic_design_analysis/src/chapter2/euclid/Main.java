package chapter2.euclid;

/**
 * Author: Qihao
 * Date: 2019/11/28  14:53
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        int a = 49, b = 14;
        Euclid euclid = new Euclid();
        int g = euclid.gcd(a, b);
        System.out.println("g is:  " + g);
    }
}

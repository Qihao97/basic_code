package chapter2.euclid;

/**
 * Author: Qihao
 * Date: 2019/11/28  10:31
 * Content:
 * 辗转相除法
 */
public class Euclid {
    public int gcd(int a,int b){
        if (b == 0){
            return a;
        }else if ((a % b) == 0){
            return b;
        } else{
            return gcd(b,a % b);
        }
    }
}

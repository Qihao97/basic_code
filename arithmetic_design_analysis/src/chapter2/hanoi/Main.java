package chapter2.hanoi;

/**
 * Author: Qihao
 * Date: 2019/11/28  15:13
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(3);
        hanoi.hanoi(22,"X","Y","Z");
    }
}

package chapter2.fibonacci;

import java.util.Scanner;

/**
 * Author: Qihao
 * Date: 2019/11/28  10:00
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入要斐波那契数列的前几项:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("第 " + n + " 项为: " + fibonacci.fibonacci(n));
    }
}

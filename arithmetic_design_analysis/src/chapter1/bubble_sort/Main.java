package chapter1.bubble_sort;

/**
 * Author: Qihao
 * Date: 2019/11/28  8:48
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        int[] arrInt = {5,2,4,6,1,3};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + "\t");
        }
        System.out.println();

        System.out.println("执行排序:");
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + "\t");
        }
        System.out.println();
    }
}

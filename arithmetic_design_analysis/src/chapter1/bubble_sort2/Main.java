package chapter1.bubble_sort2;

/**
 * Author: Qihao
 * Date: 2019/11/28  9:21
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort2 bubble = new BubbleSort2();
        int[] arrInt = {12,36,98,56,75,52,42,36,49,81,25,16,58,64};
        System.out.println("排序前的数组为:");
        bubble.arrPrint(arrInt);
        bubble.bubbleSort(arrInt);
        System.out.println("排序后的数组为:");
        bubble.arrPrint(arrInt);

    }
}

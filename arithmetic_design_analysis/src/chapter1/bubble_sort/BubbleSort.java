package chapter1.bubble_sort;

/**
 * Author: Qihao
 * Date: 2019/11/28  8:41
 * Content:
 * 本类用于实现冒泡排序
 */
public class BubbleSort {
    public BubbleSort() {
    }

    public void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

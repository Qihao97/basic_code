package chapter1.bubble_sort2;

/**
 * Author: Qihao
 * Date: 2019/11/28  9:19
 * Content:
 */
public class BubbleSort2 {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j  + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i != 0)&&(i % 15 == 0)){
                System.out.println();
            }
        }
        System.out.println("\n数组遍历完毕!");
    }
}

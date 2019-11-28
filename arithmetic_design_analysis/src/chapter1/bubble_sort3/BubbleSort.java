package chapter1.bubble_sort3;

/**
 * Author: Qihao
 * Date: 2019/11/28  9:36
 * Content:
 */
public class BubbleSort {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                System.out.println("没有交换数据");
                break;
            }
        }
    }

    public void myexchenage(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i != 0) && (i % 15 == 0)){
                System.out.println();
            }
        }
        System.out.println("\n该数组遍历完毕!");
    }
}

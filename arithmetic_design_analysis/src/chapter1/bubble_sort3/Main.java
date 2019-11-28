package chapter1.bubble_sort3;

/**
 * Author: Qihao
 * Date: 2019/11/28  9:43
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        int[] arrInt = {12,23,45,56,78,89,98,87,65,54,21,32,55,58,52,36,31,34,69,96,49,64,91,81,16};
        BubbleSort bubbleSort3 = new BubbleSort();
        System.out.println("排序前的数组为:");
        bubbleSort3.arrPrint(arrInt);

        bubbleSort3.bubbleSort(arrInt);
        System.out.println("排序后的数组为:");
        bubbleSort3.arrPrint(arrInt);

        System.out.println("---------*****Gorgeous Dividing Line*****---------");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        bubbleSort3.arrPrint(arr);
        bubbleSort3.bubbleSort(arr);
        bubbleSort3.arrPrint(arr);
    }
}

package cn.edu.henau.Arrays;

import java.util.Arrays;

/*
* 将一个随机数组升序排序，在逆序打印
* */
public class Demo_02_Arrays_Practise {
    public static void main(String[] args) {
        String str = "akfwejirnjdiofjfsjfeijieojioeoutyfnncvnfdsmxjaj125454331";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + "  ");
            if (i == 0){
                System.out.println();
            }
        }
    }
}

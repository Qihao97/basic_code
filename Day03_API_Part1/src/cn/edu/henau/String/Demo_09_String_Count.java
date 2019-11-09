package cn.edu.henau.String;

import java.util.Scanner;

/*
* 键盘输入一个字符串，统计其中各种字符的个数
* 字符的种类有：
*   大写、小写字母，数字、其他
* */
public class Demo_09_String_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
//        sc.next(),遇到空格就停止输入，sc.nextLine()遇到空格还可以输入，遇到回车停止输入
        String str = sc.nextLine();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        int[] arrayInt = countCharr(str);
        countUpper = arrayInt[0];
        countLower = arrayInt[1];
        countNumber = arrayInt[2];
        countOther = arrayInt[3];

        System.out.println("Upper: " + countUpper);
        System.out.println("Lower: " + countLower);
        System.out.println("Number: " + countNumber);
        System.out.println("OtherCharacter: " + countOther);
    }

    public static int[] countCharr(String str){
        int[] intArray = {0,0,0,0};
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z'){
                intArray[0] ++;
            }else if('a' <= ch && ch <= 'z'){
                intArray[1] ++;
            }else if('0' <= ch && ch <= '9'){
                intArray[2] ++;
            }else {
                intArray[3] ++;
            }
        }
        return intArray;
    }
}

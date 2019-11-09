package cn.edu.henau.String;

/*
* 拼接字符串：
* 定义一个方法，把数组{1,2,3} 按照指定格式拼接成一个字符串。
* 格式： [word1#word2#word3]
*
* 方法要素：
* 1.返回值类型：String
* 2.方法名称：fromArrayToString
* 3.参数列表 int[]
* */

public class Demo_08_String_Practise {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5,6,7,8,9};
        System.out.println("原来的数组是：");
        printArray(arrayInt);
        String str = fromArrayToString(arrayInt);
        System.out.println("改好的格式是：\n" + str);
    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                str += "word" + array[i] + "]";
                System.out.println("格式已改！");
            } else {
              str += "word" + array[i] + "#";
            }
        }
        return str;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.println(array[i] + "]");
            }else{
                System.out.print(array[i] + ",");
            }
        }
    }
}

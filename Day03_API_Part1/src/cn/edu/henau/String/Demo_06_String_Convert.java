package cn.edu.henau.String;

/*
* String中与转换相关的常用方法有：
* 1.将当前字符串拆分为字符数组作为返回值：
*   public char[] toCharArray()
*   获取当前字符串的底层字节数据
*   public byte[] getBytes()
* 2.将所有出现的老字符串替换为新的字符串
*   public String replace(CharSequence oldString,CharSequence newString)
*   CharSequence的意思是可以接受字符串
* */
public class Demo_06_String_Convert {
    public static void main(String[] args) {

//        将String对象转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println("chars[0]:\t" + chars[0]);
        System.out.println("chars.length:\t" + chars.length);

//        将String对象转换为字节数组
        String str = "IHaveADreame!";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "    ");
            if(i == bytes.length - 1){
                System.out.println();
            }
        }

//        替换String对象中的指定内容,返回一个新的字符串，不改变源字符串
        System.out.println("替换String对象中的指定内容:");
        String str1 = "Hello World!";
        System.out.println("str1:  " + str1);
        String str2 = str1.replace("l","@@@@@@@@@@");
        System.out.println("str1:  " + str1);
        System.out.println("str2:  " + str2);
    }
}

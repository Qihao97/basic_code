package cn.edu.henau.String;

/*
* String字符串中与获取相关的常用方法：
* 1.获取字符串的长度：length()
*   public int length()
* 2.将当前的字符串和参数字符串拼接成为返回值新的字符串
*   public String concat(String str)
* 3.获取指定索引位置的单个字符
*   public char charAt(int index)
* 4.查找参数字符串在本字符串中首次出现的索引位置，如果没有，返回-1
*   public int indexOf(String str)
*
* */
public class Demo_04_String_Get {
    public static void main(String[] args) {
//        获取字符串的长度
        String str = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println("This String's length is:" + str.length());

//        拼接字符串,拼接后返回一个新的字符串，原来的字符串都不变
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);

//        获取指定位置的单个字符
        System.out.println("-*--*--*--*--*--*--*--*--*-");
        char ch = str1.charAt(1);
        System.out.println(ch);

//        查找参数字符串在大字符串当中出现的第一次索引，没有返回 -1
        System.out.println("-*--*--*--*--*--*--*--*--*--*-");
        String original = "HelloWorld";
        int index = original.indexOf("orl");
        System.out.println(original + " 中首次出现的位置 " + index);
    }
}

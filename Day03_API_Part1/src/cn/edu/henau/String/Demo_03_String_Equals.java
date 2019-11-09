package cn.edu.henau.String;

/*
*  == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
*  public boolean equals(Object obj):参数可以是任何对象，但只有参数是一个字符串，并且内容完全相同才会返回true，
*  否则都是false
*
*注意事项：
* 1.任何对象都可以使用Object接收。
* 2.equals方法具有对称性，即a.equals(b)与b.equals(a)效果是一样的
* 3.如果比较双方一个常量一个变量，推荐让常量来调用equals方法，因为变量有可能是空的
*      eg: "abc".equals(str);
* 4.忽略大小写的方法： equalsIgnoreCase（）,只针对英文字母忽略大小写
*   public boolean equalsIgnoreCase(String str)
*
*/
public class Demo_03_String_Equals {
    public static void main(String[] args) {
        String str1 = "Hello!";
        String str2 = "Hello!";
        char[] charArray = {'H','e','l','l','o','!'};
        String str3 = new String(charArray);

        System.out.println("str1,str2" + str1.equals(str2));
        System.out.println("str2,str3" + str2.equals(str3));
        System.out.println(str3.equals("Hello!"));
        System.out.println("Hello!".equals(str1));

        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*-");
        String str4 = "hello!";
        System.out.println("不区分大小写： " + str1.equalsIgnoreCase(str1));

    }
}

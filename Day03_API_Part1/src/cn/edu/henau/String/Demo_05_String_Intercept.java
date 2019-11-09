package cn.edu.henau.String;

/*
* 字符串的截取方法：
* 1.截取从参数位置一直到字符串末尾，返回新的字符串。
*   public String substring(int index)
* 2.截取从begin开始，一直到end结束，中间的字符串,左闭右开区间
*   public String substring(int begin,int end)
* 3.
* */
public class Demo_05_String_Intercept {
    public static void main(String[] args) {
        String str = "HelloWorld!-*--*--*-HelloWorld!-*--*-";
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,15));
        String str1 = "0123456789abcdf";
        System.out.println(str1.substring(5,9));

//        下面这种写法，字符串的内容仍然是没有改变的
//        字符串名字中保存的是字符串内容的地址值，重新赋值的时候，
//        名称指向了另外一个字符串，而原来的字符串常量并没有发生改变
        String StrA = "Hello!";
        System.out.println("StrA: " + StrA);
        StrA = "World.";
        System.out.println("StrA: " + StrA);
    }
}

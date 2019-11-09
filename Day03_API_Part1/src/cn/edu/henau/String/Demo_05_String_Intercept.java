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
    }
}

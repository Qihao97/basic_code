package cn.edu.henau.String;

/*
* 分割字符串的方法：
* 按照参数的规则，将字符串切分为若干个部分
*   public String[] split(String regex):
*
* 注意事项：
* split方法的参数其实是一个正则表达式，
* 如果按照英文句点切分，要写成 \\.
*
* */
public class Demo_07_String_Split {
    public static void main(String[] args) {
//        按照逗号来切分
        String str = "Beijing,Shanghai,Chongqing,Zhengzhou,Hangzhou";
        String[] arrayStr =  str.split(",");
        System.out.println("切分后的字符串为：  ");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.print(arrayStr[i] + "    ");
            if(i  == arrayStr.length - 1){
                System.out.println();
                System.out.println("-*-@-$-#--*-@-$-#--*-@-$-#--*-@-$-#-");
            }
        }

//        按照英文句号来切分
        String str1 = "Beijing.Shanghai.Zhengzhou.Chongqing.Hangzhou.Xiangyang.Nanyang";
        String[] arrayStr1 = str1.split("\\.");
        System.out.println("按照英文句点切分后的字符串数组是：");
        for (int i = 0; i < arrayStr1.length; i++) {
            System.out.print(arrayStr1[i] + "  ");
            if(i == arrayStr1.length - 1){
                System.out.println();
                System.out.println("-*-@-$-#--*-@-$-#--*-@-$-#--*-@-$-#-");
            }
        }
    }
}

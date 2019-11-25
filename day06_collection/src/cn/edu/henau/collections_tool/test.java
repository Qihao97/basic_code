package cn.edu.henau.collections_tool;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Qihao
 * Date: 2019/11/25  9:41
 * Content:
 */
public class test {
    public static void main(String[] args) {
        String str1 = "中国";
        String str2 = "河南";
        System.out.println(str1.compareTo(str2));




        Comparator<Object> com = Collator.getInstance(java.util.Locale.CHINA);
        String[] newArray = {"中山","汕头","广州","安庆","阳江","南京","武汉","北京","安阳","北方"};
        List<String> list = Arrays.asList(newArray);
        Collections.sort(list, com);
        for(String i:list){
            System.out.print(i+"  ");
        }

    }
}

package cn.edu.henau.collections_tool;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

/**
 * Author: Qihao
 * Date: 2019/11/25  9:56
 * Content:
 */
public class Test2 {
    public static void main(String[] args) {
        Comparator<Object> com = Collator.getInstance(Locale.CHINA);
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"中国","河南","郑州","上海","南阳","重庆","深圳","杭州");
        System.out.println("排序前的集合为:");
        System.out.println(strings);
        System.out.println("排序后的集合为:");
        Collections.sort(strings,com);
        System.out.println(strings);
    }
}

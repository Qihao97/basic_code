package cn.edu.henau.inner_class.interface_as_parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qihao on 2019/11/17 22:22
 * java.util.list 即ArrayList所实现的接口
 */
public class Demo_Interface_Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }
}

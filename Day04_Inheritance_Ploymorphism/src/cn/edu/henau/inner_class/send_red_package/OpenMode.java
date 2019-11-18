package cn.edu.henau.inner_class.send_red_package;

import java.util.ArrayList;

/**
 * Author: Qihao
 * Date: 2019/11/18  20:02
 * Content:
 *    将totalMoney分成count份,保存到ArrayList<Integer>中,返回即可.
 *
 */
public interface OpenMode {
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}

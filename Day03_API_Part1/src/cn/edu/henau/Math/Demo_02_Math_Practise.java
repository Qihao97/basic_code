package cn.edu.henau.Math;

/*
* 输出-10.8到5.9之间,绝对值大于6小于2.1的整数：
* */
public class Demo_02_Math_Practise {
    public static void main(String[] args) {
        int count = 0;
        double min = Math.ceil(-10.8);
        double max = Math.floor(2.1);
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("共计：" + count);
    }
}

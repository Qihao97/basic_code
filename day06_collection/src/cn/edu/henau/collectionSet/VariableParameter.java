package cn.edu.henau.collectionSet;

/**
 * Author: Qihao
 * Date: 2019/11/24  19:30
 * Content:
 * 可变参数:
 *  可变参数出现于JDK1.5之后
 *  使用前提:
 *      当方法的参数列表的数据类型已经确定,但是参数的个数还不确定
 *  使用格式:
 *      定义方法时使用
 *      修饰符  返回值类型 方法名(数据类型...变量名){}
 *
 *  可变参数原理:
 *      底层是一个数组,根据传递参数的个数不同,会创建不同长度的数组,来存储这些参数,
 *      传递的参数个数可以是0个或多个
 *
 * 可变参数的注意事项:
 *    1.一个方法的参数列表,只能有一个可变参数
 *    2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
 *
 * 可变参数的特殊写法,也叫终极写法
 *    public static void method(Object...obj){
 *        方法体;
 *    }
 */
public class VariableParameter {
    public static void main(String[] args) {
        int[] arr = new int[1001];
        for (int i = 0; i <= 1000; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
            if (i % 30 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("---------*****华丽的分割线*****---------");
        System.out.println("arr数组的总和为:" + addArrayInt(arr));
        System.out.println("---------*****华丽的分割线*****---------");
        int sum = addMore(1,2,3,4,5,6,7,8,9,10);
        System.out.println("这十个数的和为:  " + sum);
    }

//    定义一个方法,计算两个int类型整数的和
    public static int add(int a,int b){
        return a + b;
    }

//    定义方法,计算int数组的元素总和
    public static int addArrayInt(int[] arr){
        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        return sum;
    }

//    定义一个方法,用来计算多个整数的值
    public static int addMore(int ... arr){
        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        return sum;
    }
}

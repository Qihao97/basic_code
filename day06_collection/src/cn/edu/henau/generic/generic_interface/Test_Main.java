package cn.edu.henau.generic.generic_interface;

/**
 * Author: Qihao
 * Date: 2019/11/21  21:21
 * Content:
 */
public class Test_Main {
    public static void main(String[] args) {
        GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        genericInterface.method("test");

        System.out.println("----------华丽的分割线---------");
        GenericInterfaceImpl2<Integer> integerGenericInterfaceImpl2 = new GenericInterfaceImpl2<>();
        integerGenericInterfaceImpl2.method(2333);
    }

}

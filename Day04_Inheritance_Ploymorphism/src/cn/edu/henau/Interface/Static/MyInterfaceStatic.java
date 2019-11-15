package cn.edu.henau.Interface.Static;

/*
* 从java8开始，接口中允许定义静态内容方法
* 格式：
*   public static 返回值类型 方法名称(参数列表){
*       方法体;
*   }
*   即 将abstract或者default换成static，带上方法体
* */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法.");
    }
}

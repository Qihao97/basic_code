package cn.edu.henau.day03MethodOverload;

public class methodOverload {
    public static void main(String[] args) {
        int a = 10,b = 20,c = 30,d = 40;
        System.out.println(sum(b,c));
        System.out.println(sum(b,b,c));
        System.out.println(sum(a,a,a,a));
        System.out.println(sum(a,b,c,d));
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    public static int  sum(int  a,int  b,int c,int d){
        return a + b + c + d;
    }
}

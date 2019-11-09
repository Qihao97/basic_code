package cn.edu.henau.Static;

/*
* 如果一个成员变量使用了static关键字，那么此变量属于所在的类,即多个对象共享同一个属性
*
* */
public class Demo_01_Static_Field {
    public static void main(String[] args) {
        Static_Test_Student[] student = new Static_Test_Student[10];
        student[0] = new Static_Test_Student("Jack", 23);
        System.out.println(student[0].toString());
        student[1] = new Static_Test_Student("Marry",21);
        System.out.println("修改一下Marry的教室信息后：");
        student[1].setClassroom("B509");
        System.out.println(student[0].toString());
        System.out.println(student[1].toString());

    }
}

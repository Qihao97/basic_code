package cn.edu.henau.demo1class;

public class Demo08_Student_Main {
    public static void main(String[] args) {
        Demo07_Student stu = new Demo07_Student();
        stu.setAge(20);
        stu.setName("Jan");
        stu.setMale(false);

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("IsMale: " + stu.isMale());
    }
}

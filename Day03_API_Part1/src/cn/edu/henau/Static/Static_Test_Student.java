package cn.edu.henau.Static;

/*
* Demo1的测试类
* */
public class Static_Test_Student {
    private int id;
    private String name;
    private int age;
    static private String classroom;
    private static int idCounter = 0;

    public static String getClassroom() {
        return classroom;
    }

    public static void setClassroom(String classroom) {
        Static_Test_Student.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Static_Test_Student{" +
                "id = " + id + ", " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classroom: " + classroom  +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Static_Test_Student() {
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Static_Test_Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }
}

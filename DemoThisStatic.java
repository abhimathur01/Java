//static and this keyword
class Student {
    int roll;
    String name;
    int age;
    static String college = "GEHU DDN";

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    Student(String name, int roll, int age) {
        this(name, roll);
        this.age = age;
        printData(this);
    }

    void printData(Student obj) {
        System.out.println("Name : " + obj.name);
        System.out.println("Roll no : " + obj.roll);
        System.out.println("Age : " + obj.age);
    }

    static void changeCollege() {
        college = "GEHU BTL";
    }
}

public class DemoThisStatic {
    public static void main(String[] args) {
        Student s1 = new Student("abhi", 4, 20);
    }
}

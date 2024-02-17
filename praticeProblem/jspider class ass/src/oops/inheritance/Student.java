package oops.inheritance;

class Person{
    static String name;
    static int age;
}
public class Student extends Person {
    static int sid;

    public static void main(String[] args) {
        name = "Sai";
        age = 22;
        sid = 1901202353;
        System.out.println("Student Name: "+ name);
        System.out.println("Student Age: "+ age);
        System.out.println("Student ID: "+ sid);
    }
}

package oops.inheritance;

public class A {
    static int age;
}
class B extends A{
    public static void main(String[] args) {
        age = 10;
        System.out.println(age);
    }
}

package typeconversion.nonPrimitive;

class A{
    int age;
}

class B extends A{
    String name;
}
public class UpCasting {
    public static void main(String[] args) {
        A a1 = new B();
        System.out.println(a1.age);
//        System.out.println(a1.name); //compile time error
    }
}

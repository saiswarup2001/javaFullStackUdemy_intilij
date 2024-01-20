package basics;
abstract class abc{
    abstract void method1(); //is a restricted class that cannot be used to create objects.
    public void method2(){
        System.out.println("parent class");
    }
}

class subClass extends abc{

    @Override
    void method1() {
        System.out.println("abstract method override");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        subClass sc = new subClass();
        sc.method1();
        sc.method2();
    }
}

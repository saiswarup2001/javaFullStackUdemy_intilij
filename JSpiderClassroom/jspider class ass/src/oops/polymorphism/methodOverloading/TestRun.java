package oops.polymorphism.methodOverloading;


class Test{
    void test(int i){
        System.out.println("Test One with int value: "+ i);
    }

    void test(int i, double j){
        System.out.println("Test two using int + double: "+ i +", "+ j);
    }

    void test(String name, char ch){
        System.out.println("Test three using String + ch: "+ name+", "+ ch);
    }
}
public class TestRun {
    public static void main(String[] args) {
        Test t = new Test();
        t.test(10);
        t.test(10, 11.50d);
        t.test("Sai", 'P');
    }
}

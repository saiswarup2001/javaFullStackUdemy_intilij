package org.functionalInterface;
@FunctionalInterface
interface A{
//    void show(); // we don't need to declare it abstract by-default it is an abstract method
    void show(int i);
}
//we know that we cannot create obj of interface class
//so, we have to make a subclass which extends the interface class or else
class B implements A{

    @Override
    public void show(int i) {
        System.out.println("this is override method "+ i);
    }
}
//we have to use the lambda Expression
// we can use lambda expression with only functional interface

public class Demo {
    public static void main(String[] args) {

        A obj1 = new B();
        obj1.show(4);

        //by overriding it here its
        A obj2 = new A() {
            @Override
            public void show(int i) {
                System.out.println("Hi I am interface of A "+ i);
            }
        };
        obj2.show(5);

        //by using lambda method
        A obj3 = i -> System.out.println("Hi I am Lambda Expression "+ i);
        obj3.show(6);
    }

}

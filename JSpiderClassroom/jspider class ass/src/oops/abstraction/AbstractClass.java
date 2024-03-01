package oops.abstraction;

abstract class A {
    //abstract int ah; //Not allowed
    //abstract static int b; //not allowed


    //constructor
    int a,b;
    public A() {
        a = 10;
        b = 20;
    }

    //concrete Method
    public void add(int a, int b){
        System.out.println("Sum ="+ (this.a+ this.b));
    }

    //Abstract Method
    abstract public void mul(int a, int b);
}
class B extends A{

    @Override
    public void mul(int a, int b) {
        System.out.println("Mul is= "+ (a*b));
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        B b = new B();
        b.add(10, 20);
        b.mul(10, 2);

    }
}


/*NOTE:
  -----
  Abstract Class: The class which is prefixed with "abstract" modifier is
                  known as abstract class.
  - Abstract class object can't be created.
  - Abstract methods don't have any implementation.
  - we can have constructor for an abstract class.
  - It can have both abstract and concrete method[by default concrete
    method behaves as a abstract method].
  - we cannot do variable and static member abstracted.
  - Even if we dont have abstract method we can make our class abstract.
  */
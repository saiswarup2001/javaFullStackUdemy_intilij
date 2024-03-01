package oops.abstraction;


class Concrete{
    public void add(int a, int b){
        System.out.println("Sum ="+ (a+b));
    }
}
public class ConcreteClass {
    public static void main(String[] args) {
        Concrete c = new Concrete();
        c.add(10,20);
    }
}


/*NOTE:
* -----
    Concrete class : A class do not prefixed with "abstract keyword" and donot have any
    ---------------- abstract method in it is known as Concrete class.

    * It behaves as a subclass for abstract class and implements all the
      methods of abstract class.
* */
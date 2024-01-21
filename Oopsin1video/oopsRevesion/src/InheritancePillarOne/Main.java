package InheritancePillarOne;

//parent class
class Animal{
    int legs;
    void eat(){
        System.out.println("Eating....");
    }

    void walk(){
        System.out.println("Walking...");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("Dog is Eating...");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Dog is Walking....");
    }

    public void colour(){
        System.out.println("Black and White..");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.eat();
        a.walk();
        a.colour();
    }
}

